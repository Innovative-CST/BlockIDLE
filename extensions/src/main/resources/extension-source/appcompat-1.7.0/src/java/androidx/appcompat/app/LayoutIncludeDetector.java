package androidx.appcompat.app;

import org.xmlpull.v1.XmlPullParserException;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import androidx.annotation.NonNull;
import org.xmlpull.v1.XmlPullParser;
import java.lang.ref.WeakReference;
import java.util.Deque;

class LayoutIncludeDetector
{
    @NonNull
    private final Deque<WeakReference<XmlPullParser>> mXmlParserStack;
    
    LayoutIncludeDetector() {
        this.mXmlParserStack = (Deque<WeakReference<XmlPullParser>>)new ArrayDeque();
    }
    
    boolean detect(@NonNull final AttributeSet attrs) {
        if (attrs instanceof XmlPullParser) {
            final XmlPullParser xmlAttrs = (XmlPullParser)attrs;
            if (xmlAttrs.getDepth() == 1) {
                final XmlPullParser ancestorXmlAttrs = popOutdatedAttrHolders(this.mXmlParserStack);
                this.mXmlParserStack.push((Object)new WeakReference((Object)xmlAttrs));
                if (shouldInheritContext(xmlAttrs, ancestorXmlAttrs)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean shouldInheritContext(@NonNull final XmlPullParser parser, @Nullable final XmlPullParser previousParser) {
        if (previousParser != null && parser != previousParser) {
            try {
                if (previousParser.getEventType() == 2) {
                    return "include".equals((Object)previousParser.getName());
                }
            }
            catch (final XmlPullParserException ex) {}
        }
        return false;
    }
    
    @Nullable
    private static XmlPullParser popOutdatedAttrHolders(@NonNull final Deque<WeakReference<XmlPullParser>> xmlParserStack) {
        while (!xmlParserStack.isEmpty()) {
            final XmlPullParser parser = (XmlPullParser)((WeakReference)xmlParserStack.peek()).get();
            if (!isParserOutdated(parser)) {
                return parser;
            }
            xmlParserStack.pop();
        }
        return null;
    }
    
    private static boolean isParserOutdated(@Nullable final XmlPullParser parser) {
        try {
            return parser == null || parser.getEventType() == 3 || parser.getEventType() == 1;
        }
        catch (final XmlPullParserException e) {
            return true;
        }
    }
}
