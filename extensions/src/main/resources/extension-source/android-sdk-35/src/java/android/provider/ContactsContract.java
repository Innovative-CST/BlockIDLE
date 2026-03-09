package android.provider;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.graphics.Rect;
import android.view.View;
import android.content.Context;
import android.content.ContentProviderOperation;
import android.util.Pair;
import android.os.RemoteException;
import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.EntityIterator;
import android.database.Cursor;
import java.io.InputStream;
import android.content.ContentResolver;
import android.content.res.Resources;
import android.net.Uri;

public final class ContactsContract
{
    public static final String AUTHORITY = "com.android.contacts";
    public static final Uri AUTHORITY_URI;
    public static final String CALLER_IS_SYNCADAPTER = "caller_is_syncadapter";
    public static final String DEFERRED_SNIPPETING = "deferred_snippeting";
    public static final String DEFERRED_SNIPPETING_QUERY = "deferred_snippeting_query";
    public static final String DIRECTORY_PARAM_KEY = "directory";
    public static final String LIMIT_PARAM_KEY = "limit";
    public static final String PRIMARY_ACCOUNT_NAME = "name_for_primary_account";
    public static final String PRIMARY_ACCOUNT_TYPE = "type_for_primary_account";
    public static final String REMOVE_DUPLICATE_ENTRIES = "remove_duplicate_entries";
    public static final String STREQUENT_PHONE_ONLY = "strequent_phone_only";
    
    public ContactsContract() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isProfileId(final long id) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        AUTHORITY_URI = null;
    }
    
    public static final class AggregationExceptions implements BaseColumns
    {
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/aggregation_exception";
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/aggregation_exception";
        public static final Uri CONTENT_URI;
        public static final String RAW_CONTACT_ID1 = "raw_contact_id1";
        public static final String RAW_CONTACT_ID2 = "raw_contact_id2";
        public static final String TYPE = "type";
        public static final int TYPE_AUTOMATIC = 0;
        public static final int TYPE_KEEP_SEPARATE = 2;
        public static final int TYPE_KEEP_TOGETHER = 1;
        
        AggregationExceptions() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
        }
    }
    
    public static final class CommonDataKinds
    {
        CommonDataKinds() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Callable implements DataColumnsWithJoins, CommonColumns
        {
            public static final Uri CONTENT_FILTER_URI;
            public static final Uri CONTENT_URI;
            public static final Uri ENTERPRISE_CONTENT_FILTER_URI;
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            
            public Callable() {
                throw new RuntimeException("Stub!");
            }
            
            static {
                CONTENT_FILTER_URI = null;
                CONTENT_URI = null;
                ENTERPRISE_CONTENT_FILTER_URI = null;
            }
        }
        
        public static final class Contactables implements DataColumnsWithJoins, CommonColumns
        {
            public static final Uri CONTENT_FILTER_URI;
            public static final Uri CONTENT_URI;
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            public static final String VISIBLE_CONTACTS_ONLY = "visible_contacts_only";
            
            public Contactables() {
                throw new RuntimeException("Stub!");
            }
            
            static {
                CONTENT_FILTER_URI = null;
                CONTENT_URI = null;
            }
        }
        
        public static final class Email implements DataColumnsWithJoins, CommonColumns
        {
            public static final String ADDRESS = "data1";
            public static final Uri CONTENT_FILTER_URI;
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/email_v2";
            public static final Uri CONTENT_LOOKUP_URI;
            public static final String CONTENT_TYPE = "vnd.android.cursor.dir/email_v2";
            public static final Uri CONTENT_URI;
            public static final String DISPLAY_NAME = "data4";
            public static final Uri ENTERPRISE_CONTENT_FILTER_URI;
            public static final Uri ENTERPRISE_CONTENT_LOOKUP_URI;
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            public static final int TYPE_HOME = 1;
            public static final int TYPE_MOBILE = 4;
            public static final int TYPE_OTHER = 3;
            public static final int TYPE_WORK = 2;
            
            Email() {
                throw new RuntimeException("Stub!");
            }
            
            public static int getTypeLabelResource(final int type) {
                throw new RuntimeException("Stub!");
            }
            
            public static CharSequence getTypeLabel(final Resources res, final int type, @Nullable final CharSequence label) {
                throw new RuntimeException("Stub!");
            }
            
            static {
                CONTENT_FILTER_URI = null;
                CONTENT_LOOKUP_URI = null;
                CONTENT_URI = null;
                ENTERPRISE_CONTENT_FILTER_URI = null;
                ENTERPRISE_CONTENT_LOOKUP_URI = null;
            }
        }
        
        public static final class Event implements DataColumnsWithJoins, CommonColumns
        {
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_event";
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            public static final String START_DATE = "data1";
            public static final int TYPE_ANNIVERSARY = 1;
            public static final int TYPE_BIRTHDAY = 3;
            public static final int TYPE_OTHER = 2;
            
            Event() {
                throw new RuntimeException("Stub!");
            }
            
            public static int getTypeResource(final Integer type) {
                throw new RuntimeException("Stub!");
            }
            
            public static CharSequence getTypeLabel(final Resources res, final int type, @Nullable final CharSequence label) {
                throw new RuntimeException("Stub!");
            }
        }
        
        public static final class GroupMembership implements DataColumnsWithJoins
        {
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/group_membership";
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            public static final String GROUP_ROW_ID = "data1";
            public static final String GROUP_SOURCE_ID = "group_sourceid";
            
            GroupMembership() {
                throw new RuntimeException("Stub!");
            }
        }
        
        public static final class Identity implements DataColumnsWithJoins
        {
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/identity";
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            public static final String IDENTITY = "data1";
            public static final String NAMESPACE = "data2";
            
            Identity() {
                throw new RuntimeException("Stub!");
            }
        }
        
        @Deprecated
        public static final class Im implements DataColumnsWithJoins, CommonColumns
        {
            @Deprecated
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/im";
            @Deprecated
            public static final String CUSTOM_PROTOCOL = "data6";
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            @Deprecated
            public static final String PROTOCOL = "data5";
            @Deprecated
            public static final int PROTOCOL_AIM = 0;
            @Deprecated
            public static final int PROTOCOL_CUSTOM = -1;
            @Deprecated
            public static final int PROTOCOL_GOOGLE_TALK = 5;
            @Deprecated
            public static final int PROTOCOL_ICQ = 6;
            @Deprecated
            public static final int PROTOCOL_JABBER = 7;
            @Deprecated
            public static final int PROTOCOL_MSN = 1;
            @Deprecated
            public static final int PROTOCOL_NETMEETING = 8;
            @Deprecated
            public static final int PROTOCOL_QQ = 4;
            @Deprecated
            public static final int PROTOCOL_SKYPE = 3;
            @Deprecated
            public static final int PROTOCOL_YAHOO = 2;
            @Deprecated
            public static final int TYPE_HOME = 1;
            @Deprecated
            public static final int TYPE_OTHER = 3;
            @Deprecated
            public static final int TYPE_WORK = 2;
            
            Im() {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static int getTypeLabelResource(final int type) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static CharSequence getTypeLabel(final Resources res, final int type, @Nullable final CharSequence label) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static int getProtocolLabelResource(final int type) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static CharSequence getProtocolLabel(final Resources res, final int type, final CharSequence label) {
                throw new RuntimeException("Stub!");
            }
        }
        
        public static final class Nickname implements DataColumnsWithJoins, CommonColumns
        {
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/nickname";
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            public static final String NAME = "data1";
            public static final int TYPE_DEFAULT = 1;
            public static final int TYPE_INITIALS = 5;
            public static final int TYPE_MAIDEN_NAME = 3;
            @Deprecated
            public static final int TYPE_MAINDEN_NAME = 3;
            public static final int TYPE_OTHER_NAME = 2;
            public static final int TYPE_SHORT_NAME = 4;
            
            Nickname() {
                throw new RuntimeException("Stub!");
            }
        }
        
        public static final class Note implements DataColumnsWithJoins
        {
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/note";
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            public static final String NOTE = "data1";
            
            Note() {
                throw new RuntimeException("Stub!");
            }
        }
        
        public static final class Organization implements DataColumnsWithJoins, CommonColumns
        {
            public static final String COMPANY = "data1";
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/organization";
            public static final String DEPARTMENT = "data5";
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            public static final String JOB_DESCRIPTION = "data6";
            public static final String OFFICE_LOCATION = "data9";
            public static final String PHONETIC_NAME = "data8";
            public static final String PHONETIC_NAME_STYLE = "data10";
            public static final String SYMBOL = "data7";
            public static final String TITLE = "data4";
            public static final int TYPE_OTHER = 2;
            public static final int TYPE_WORK = 1;
            
            Organization() {
                throw new RuntimeException("Stub!");
            }
            
            public static int getTypeLabelResource(final int type) {
                throw new RuntimeException("Stub!");
            }
            
            public static CharSequence getTypeLabel(final Resources res, final int type, @Nullable final CharSequence label) {
                throw new RuntimeException("Stub!");
            }
        }
        
        public static final class Phone implements DataColumnsWithJoins, CommonColumns
        {
            public static final Uri CONTENT_FILTER_URI;
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/phone_v2";
            public static final String CONTENT_TYPE = "vnd.android.cursor.dir/phone_v2";
            public static final Uri CONTENT_URI;
            public static final Uri ENTERPRISE_CONTENT_FILTER_URI;
            @NonNull
            public static final Uri ENTERPRISE_CONTENT_URI;
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            public static final String NORMALIZED_NUMBER = "data4";
            public static final String NUMBER = "data1";
            public static final String SEARCH_DISPLAY_NAME_KEY = "search_display_name";
            public static final String SEARCH_PHONE_NUMBER_KEY = "search_phone_number";
            public static final int TYPE_ASSISTANT = 19;
            public static final int TYPE_CALLBACK = 8;
            public static final int TYPE_CAR = 9;
            public static final int TYPE_COMPANY_MAIN = 10;
            public static final int TYPE_FAX_HOME = 5;
            public static final int TYPE_FAX_WORK = 4;
            public static final int TYPE_HOME = 1;
            public static final int TYPE_ISDN = 11;
            public static final int TYPE_MAIN = 12;
            public static final int TYPE_MMS = 20;
            public static final int TYPE_MOBILE = 2;
            public static final int TYPE_OTHER = 7;
            public static final int TYPE_OTHER_FAX = 13;
            public static final int TYPE_PAGER = 6;
            public static final int TYPE_RADIO = 14;
            public static final int TYPE_TELEX = 15;
            public static final int TYPE_TTY_TDD = 16;
            public static final int TYPE_WORK = 3;
            public static final int TYPE_WORK_MOBILE = 17;
            public static final int TYPE_WORK_PAGER = 18;
            
            Phone() {
                throw new RuntimeException("Stub!");
            }
            
            public static int getTypeLabelResource(final int type) {
                throw new RuntimeException("Stub!");
            }
            
            public static CharSequence getTypeLabel(final Resources res, final int type, @Nullable final CharSequence label) {
                throw new RuntimeException("Stub!");
            }
            
            static {
                CONTENT_FILTER_URI = null;
                CONTENT_URI = null;
                ENTERPRISE_CONTENT_FILTER_URI = null;
                ENTERPRISE_CONTENT_URI = null;
            }
        }
        
        public static final class Photo implements DataColumnsWithJoins
        {
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/photo";
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            public static final String PHOTO = "data15";
            public static final String PHOTO_FILE_ID = "data14";
            
            Photo() {
                throw new RuntimeException("Stub!");
            }
        }
        
        public static final class Relation implements DataColumnsWithJoins, CommonColumns
        {
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/relation";
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            public static final String NAME = "data1";
            public static final int TYPE_ASSISTANT = 1;
            public static final int TYPE_BROTHER = 2;
            public static final int TYPE_CHILD = 3;
            public static final int TYPE_DOMESTIC_PARTNER = 4;
            public static final int TYPE_FATHER = 5;
            public static final int TYPE_FRIEND = 6;
            public static final int TYPE_MANAGER = 7;
            public static final int TYPE_MOTHER = 8;
            public static final int TYPE_PARENT = 9;
            public static final int TYPE_PARTNER = 10;
            public static final int TYPE_REFERRED_BY = 11;
            public static final int TYPE_RELATIVE = 12;
            public static final int TYPE_SISTER = 13;
            public static final int TYPE_SPOUSE = 14;
            
            Relation() {
                throw new RuntimeException("Stub!");
            }
            
            public static int getTypeLabelResource(final int type) {
                throw new RuntimeException("Stub!");
            }
            
            public static CharSequence getTypeLabel(final Resources res, final int type, @Nullable final CharSequence label) {
                throw new RuntimeException("Stub!");
            }
        }
        
        @Deprecated
        public static final class SipAddress implements DataColumnsWithJoins, CommonColumns
        {
            @Deprecated
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/sip_address";
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            @Deprecated
            public static final String SIP_ADDRESS = "data1";
            @Deprecated
            public static final int TYPE_HOME = 1;
            @Deprecated
            public static final int TYPE_OTHER = 3;
            @Deprecated
            public static final int TYPE_WORK = 2;
            
            SipAddress() {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static int getTypeLabelResource(final int type) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static CharSequence getTypeLabel(final Resources res, final int type, @Nullable final CharSequence label) {
                throw new RuntimeException("Stub!");
            }
        }
        
        public static final class StructuredName implements DataColumnsWithJoins
        {
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/name";
            public static final String DISPLAY_NAME = "data1";
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            public static final String FAMILY_NAME = "data3";
            public static final String FULL_NAME_STYLE = "data10";
            public static final String GIVEN_NAME = "data2";
            public static final String MIDDLE_NAME = "data5";
            public static final String PHONETIC_FAMILY_NAME = "data9";
            public static final String PHONETIC_GIVEN_NAME = "data7";
            public static final String PHONETIC_MIDDLE_NAME = "data8";
            public static final String PHONETIC_NAME_STYLE = "data11";
            public static final String PREFIX = "data4";
            public static final String SUFFIX = "data6";
            
            StructuredName() {
                throw new RuntimeException("Stub!");
            }
        }
        
        public static final class StructuredPostal implements DataColumnsWithJoins, CommonColumns
        {
            public static final String CITY = "data7";
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/postal-address_v2";
            public static final String CONTENT_TYPE = "vnd.android.cursor.dir/postal-address_v2";
            public static final Uri CONTENT_URI;
            public static final String COUNTRY = "data10";
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            public static final String FORMATTED_ADDRESS = "data1";
            public static final String NEIGHBORHOOD = "data6";
            public static final String POBOX = "data5";
            public static final String POSTCODE = "data9";
            public static final String REGION = "data8";
            public static final String STREET = "data4";
            public static final int TYPE_HOME = 1;
            public static final int TYPE_OTHER = 3;
            public static final int TYPE_WORK = 2;
            
            StructuredPostal() {
                throw new RuntimeException("Stub!");
            }
            
            public static int getTypeLabelResource(final int type) {
                throw new RuntimeException("Stub!");
            }
            
            public static CharSequence getTypeLabel(final Resources res, final int type, @Nullable final CharSequence label) {
                throw new RuntimeException("Stub!");
            }
            
            static {
                CONTENT_URI = null;
            }
        }
        
        public static final class Website implements DataColumnsWithJoins, CommonColumns
        {
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/website";
            public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
            public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
            public static final int TYPE_BLOG = 2;
            public static final int TYPE_FTP = 6;
            public static final int TYPE_HOME = 4;
            public static final int TYPE_HOMEPAGE = 1;
            public static final int TYPE_OTHER = 7;
            public static final int TYPE_PROFILE = 3;
            public static final int TYPE_WORK = 5;
            public static final String URL = "data1";
            
            Website() {
                throw new RuntimeException("Stub!");
            }
        }
        
        protected interface CommonColumns extends BaseTypes
        {
            public static final String DATA = "data1";
            public static final String LABEL = "data3";
            public static final String TYPE = "data2";
        }
        
        public interface BaseTypes
        {
            public static final int TYPE_CUSTOM = 0;
        }
    }
    
    public static class Contacts implements BaseColumns, ContactsColumns, ContactOptionsColumns, ContactNameColumns, ContactStatusColumns
    {
        public static final Uri CONTENT_FILTER_URI;
        @Deprecated
        public static final Uri CONTENT_FREQUENT_URI;
        public static final Uri CONTENT_GROUP_URI;
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact";
        public static final Uri CONTENT_LOOKUP_URI;
        public static final Uri CONTENT_MULTI_VCARD_URI;
        public static final Uri CONTENT_STREQUENT_FILTER_URI;
        public static final Uri CONTENT_STREQUENT_URI;
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contact";
        public static final Uri CONTENT_URI;
        public static final String CONTENT_VCARD_TYPE = "text/x-vcard";
        public static final Uri CONTENT_VCARD_URI;
        public static final Uri ENTERPRISE_CONTENT_FILTER_URI;
        @NonNull
        public static final Uri ENTERPRISE_CONTENT_URI;
        public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
        public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
        public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
        public static final String QUERY_PARAMETER_VCARD_NO_PHOTO = "no_photo";
        
        Contacts() {
            throw new RuntimeException("Stub!");
        }
        
        public static Uri getLookupUri(final ContentResolver resolver, final Uri contactUri) {
            throw new RuntimeException("Stub!");
        }
        
        public static Uri getLookupUri(final long contactId, final String lookupKey) {
            throw new RuntimeException("Stub!");
        }
        
        public static Uri lookupContact(final ContentResolver resolver, final Uri lookupUri) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public static void markAsContacted(final ContentResolver resolver, final long contactId) {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean isEnterpriseContactId(final long contactId) {
            throw new RuntimeException("Stub!");
        }
        
        public static InputStream openContactPhotoInputStream(final ContentResolver cr, final Uri contactUri, final boolean preferHighres) {
            throw new RuntimeException("Stub!");
        }
        
        public static InputStream openContactPhotoInputStream(final ContentResolver cr, final Uri contactUri) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_FILTER_URI = null;
            CONTENT_FREQUENT_URI = null;
            CONTENT_GROUP_URI = null;
            CONTENT_LOOKUP_URI = null;
            CONTENT_MULTI_VCARD_URI = null;
            CONTENT_STREQUENT_FILTER_URI = null;
            CONTENT_STREQUENT_URI = null;
            CONTENT_URI = null;
            CONTENT_VCARD_URI = null;
            ENTERPRISE_CONTENT_FILTER_URI = null;
            ENTERPRISE_CONTENT_URI = null;
        }
        
        public static final class AggregationSuggestions implements BaseColumns, ContactsColumns, ContactOptionsColumns, ContactStatusColumns
        {
            public static final String CONTENT_DIRECTORY = "suggestions";
            
            AggregationSuggestions() {
                throw new RuntimeException("Stub!");
            }
            
            public static final class Builder
            {
                public Builder() {
                    throw new RuntimeException("Stub!");
                }
                
                public Builder setContactId(final long contactId) {
                    throw new RuntimeException("Stub!");
                }
                
                public Builder addNameParameter(final String name) {
                    throw new RuntimeException("Stub!");
                }
                
                public Builder setLimit(final int limit) {
                    throw new RuntimeException("Stub!");
                }
                
                public Uri build() {
                    throw new RuntimeException("Stub!");
                }
            }
        }
        
        public static final class Data implements BaseColumns, DataColumns
        {
            public static final String CONTENT_DIRECTORY = "data";
            
            Data() {
                throw new RuntimeException("Stub!");
            }
        }
        
        public static final class Entity implements BaseColumns, ContactsColumns, ContactNameColumns, RawContactsColumns, BaseSyncColumns, SyncColumns, DataColumns, StatusColumns, ContactOptionsColumns, ContactStatusColumns, DataUsageStatColumns
        {
            public static final String CONTENT_DIRECTORY = "entities";
            public static final String DATA_ID = "data_id";
            public static final String RAW_CONTACT_ID = "raw_contact_id";
            
            Entity() {
                throw new RuntimeException("Stub!");
            }
        }
        
        public static final class Photo implements BaseColumns, DataColumnsWithJoins
        {
            public static final String CONTENT_DIRECTORY = "photo";
            public static final String DISPLAY_PHOTO = "display_photo";
            public static final String PHOTO = "data15";
            public static final String PHOTO_FILE_ID = "data14";
            
            Photo() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class Data implements DataColumnsWithJoins
    {
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/data";
        public static final Uri CONTENT_URI;
        public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
        public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
        public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
        public static final String VISIBLE_CONTACTS_ONLY = "visible_contacts_only";
        
        Data() {
            throw new RuntimeException("Stub!");
        }
        
        public static Uri getContactLookupUri(final ContentResolver resolver, final Uri dataUri) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
        }
    }
    
    @Deprecated
    public static final class DataUsageFeedback
    {
        @Deprecated
        public static final Uri DELETE_USAGE_URI;
        @Deprecated
        public static final Uri FEEDBACK_URI;
        @Deprecated
        public static final String USAGE_TYPE = "type";
        @Deprecated
        public static final String USAGE_TYPE_CALL = "call";
        @Deprecated
        public static final String USAGE_TYPE_LONG_TEXT = "long_text";
        @Deprecated
        public static final String USAGE_TYPE_SHORT_TEXT = "short_text";
        
        @Deprecated
        public DataUsageFeedback() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            DELETE_USAGE_URI = null;
            FEEDBACK_URI = null;
        }
    }
    
    public static final class DeletedContacts implements DeletedContactsColumns
    {
        public static final Uri CONTENT_URI;
        public static final long DAYS_KEPT_MILLISECONDS = 2592000000L;
        
        DeletedContacts() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
        }
    }
    
    public static final class Directory implements BaseColumns
    {
        public static final String ACCOUNT_NAME = "accountName";
        public static final String ACCOUNT_TYPE = "accountType";
        public static final String CALLER_PACKAGE_PARAM_KEY = "callerPackage";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_directory";
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contact_directories";
        public static final Uri CONTENT_URI;
        public static final long DEFAULT = 0L;
        public static final String DIRECTORY_AUTHORITY = "authority";
        public static final String DISPLAY_NAME = "displayName";
        public static final Uri ENTERPRISE_CONTENT_URI;
        public static final long ENTERPRISE_DEFAULT = 1000000000L;
        public static final long ENTERPRISE_LOCAL_INVISIBLE = 1000000001L;
        public static final String EXPORT_SUPPORT = "exportSupport";
        public static final int EXPORT_SUPPORT_ANY_ACCOUNT = 2;
        public static final int EXPORT_SUPPORT_NONE = 0;
        public static final int EXPORT_SUPPORT_SAME_ACCOUNT_ONLY = 1;
        public static final long LOCAL_INVISIBLE = 1L;
        public static final String PACKAGE_NAME = "packageName";
        public static final String PHOTO_SUPPORT = "photoSupport";
        public static final int PHOTO_SUPPORT_FULL = 3;
        public static final int PHOTO_SUPPORT_FULL_SIZE_ONLY = 2;
        public static final int PHOTO_SUPPORT_NONE = 0;
        public static final int PHOTO_SUPPORT_THUMBNAIL_ONLY = 1;
        public static final String SHORTCUT_SUPPORT = "shortcutSupport";
        public static final int SHORTCUT_SUPPORT_DATA_ITEMS_ONLY = 1;
        public static final int SHORTCUT_SUPPORT_FULL = 2;
        public static final int SHORTCUT_SUPPORT_NONE = 0;
        public static final String TYPE_RESOURCE_ID = "typeResourceId";
        
        Directory() {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean isRemoteDirectoryId(final long directoryId) {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean isEnterpriseDirectoryId(final long directoryId) {
            throw new RuntimeException("Stub!");
        }
        
        public static void notifyDirectoryChange(final ContentResolver resolver) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
            ENTERPRISE_CONTENT_URI = null;
        }
    }
    
    public static final class DisplayPhoto
    {
        public static final Uri CONTENT_MAX_DIMENSIONS_URI;
        public static final Uri CONTENT_URI;
        public static final String DISPLAY_MAX_DIM = "display_max_dim";
        public static final String THUMBNAIL_MAX_DIM = "thumbnail_max_dim";
        
        DisplayPhoto() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_MAX_DIMENSIONS_URI = null;
            CONTENT_URI = null;
        }
    }
    
    public static final class Groups implements BaseColumns, GroupsColumns, SyncColumns
    {
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/group";
        public static final Uri CONTENT_SUMMARY_URI;
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/group";
        public static final Uri CONTENT_URI;
        
        Groups() {
            throw new RuntimeException("Stub!");
        }
        
        public static EntityIterator newEntityIterator(final Cursor cursor) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_SUMMARY_URI = null;
            CONTENT_URI = null;
        }
    }
    
    public static final class Intents
    {
        public static final String ACTION_VOICE_SEND_MESSAGE_TO_CONTACTS = "android.provider.action.VOICE_SEND_MESSAGE_TO_CONTACTS";
        public static final String ATTACH_IMAGE = "com.android.contacts.action.ATTACH_IMAGE";
        public static final String CONTACTS_DATABASE_CREATED = "android.provider.Contacts.DATABASE_CREATED";
        public static final String EXTRA_CREATE_DESCRIPTION = "com.android.contacts.action.CREATE_DESCRIPTION";
        public static final String EXTRA_FORCE_CREATE = "com.android.contacts.action.FORCE_CREATE";
        public static final String EXTRA_RECIPIENT_CONTACT_CHAT_ID = "android.provider.extra.RECIPIENT_CONTACT_CHAT_ID";
        public static final String EXTRA_RECIPIENT_CONTACT_NAME = "android.provider.extra.RECIPIENT_CONTACT_NAME";
        public static final String EXTRA_RECIPIENT_CONTACT_URI = "android.provider.extra.RECIPIENT_CONTACT_URI";
        public static final String INVITE_CONTACT = "com.android.contacts.action.INVITE_CONTACT";
        public static final String METADATA_ACCOUNT_TYPE = "android.provider.account_type";
        public static final String METADATA_MIMETYPE = "android.provider.mimetype";
        public static final String SEARCH_SUGGESTION_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CLICKED";
        public static final String SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED";
        public static final String SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED";
        public static final String SHOW_OR_CREATE_CONTACT = "com.android.contacts.action.SHOW_OR_CREATE_CONTACT";
        
        public Intents() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Insert
        {
            public static final String ACTION = "android.intent.action.INSERT";
            public static final String COMPANY = "company";
            public static final String DATA = "data";
            public static final String EMAIL = "email";
            public static final String EMAIL_ISPRIMARY = "email_isprimary";
            public static final String EMAIL_TYPE = "email_type";
            public static final String EXTRA_ACCOUNT = "android.provider.extra.ACCOUNT";
            public static final String EXTRA_DATA_SET = "android.provider.extra.DATA_SET";
            public static final String FULL_MODE = "full_mode";
            public static final String IM_HANDLE = "im_handle";
            public static final String IM_ISPRIMARY = "im_isprimary";
            public static final String IM_PROTOCOL = "im_protocol";
            public static final String JOB_TITLE = "job_title";
            public static final String NAME = "name";
            public static final String NOTES = "notes";
            public static final String PHONE = "phone";
            public static final String PHONETIC_NAME = "phonetic_name";
            public static final String PHONE_ISPRIMARY = "phone_isprimary";
            public static final String PHONE_TYPE = "phone_type";
            public static final String POSTAL = "postal";
            public static final String POSTAL_ISPRIMARY = "postal_isprimary";
            public static final String POSTAL_TYPE = "postal_type";
            public static final String SECONDARY_EMAIL = "secondary_email";
            public static final String SECONDARY_EMAIL_TYPE = "secondary_email_type";
            public static final String SECONDARY_PHONE = "secondary_phone";
            public static final String SECONDARY_PHONE_TYPE = "secondary_phone_type";
            public static final String TERTIARY_EMAIL = "tertiary_email";
            public static final String TERTIARY_EMAIL_TYPE = "tertiary_email_type";
            public static final String TERTIARY_PHONE = "tertiary_phone";
            public static final String TERTIARY_PHONE_TYPE = "tertiary_phone_type";
            
            public Insert() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class PhoneLookup implements BaseColumns, PhoneLookupColumns, ContactsColumns, ContactOptionsColumns, ContactNameColumns
    {
        public static final Uri CONTENT_FILTER_URI;
        public static final Uri ENTERPRISE_CONTENT_FILTER_URI;
        public static final String QUERY_PARAMETER_SIP_ADDRESS = "sip";
        
        PhoneLookup() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_FILTER_URI = null;
            ENTERPRISE_CONTENT_FILTER_URI = null;
        }
    }
    
    public static final class PinnedPositions
    {
        public static final int DEMOTED = -1;
        public static final int UNPINNED = 0;
        
        public PinnedPositions() {
            throw new RuntimeException("Stub!");
        }
        
        public static void undemote(final ContentResolver contentResolver, final long contactId) {
            throw new RuntimeException("Stub!");
        }
        
        public static void pin(final ContentResolver contentResolver, final long contactId, final int pinnedPosition) {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static final class Presence extends StatusUpdates
    {
        @Deprecated
        public Presence() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Profile implements BaseColumns, ContactsColumns, ContactOptionsColumns, ContactNameColumns, ContactStatusColumns
    {
        public static final Uri CONTENT_RAW_CONTACTS_URI;
        public static final Uri CONTENT_URI;
        public static final Uri CONTENT_VCARD_URI;
        public static final long MIN_ID = 9223372034707292160L;
        
        Profile() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_RAW_CONTACTS_URI = null;
            CONTENT_URI = null;
            CONTENT_VCARD_URI = null;
        }
    }
    
    public static final class ProfileSyncState implements SyncStateContract.Columns
    {
        public static final String CONTENT_DIRECTORY = "syncstate";
        public static final Uri CONTENT_URI;
        
        ProfileSyncState() {
            throw new RuntimeException("Stub!");
        }
        
        public static byte[] get(final ContentProviderClient provider, final Account account) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public static Pair<Uri, byte[]> getWithUri(final ContentProviderClient provider, final Account account) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public static void set(final ContentProviderClient provider, final Account account, final byte[] data) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public static ContentProviderOperation newSetOperation(final Account account, final byte[] data) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
        }
    }
    
    public static final class ProviderStatus
    {
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/provider_status";
        public static final Uri CONTENT_URI;
        public static final String DATABASE_CREATION_TIMESTAMP = "database_creation_timestamp";
        public static final String STATUS = "status";
        public static final int STATUS_BUSY = 1;
        public static final int STATUS_EMPTY = 2;
        public static final int STATUS_NORMAL = 0;
        
        ProviderStatus() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
        }
    }
    
    public static final class QuickContact
    {
        public static final String ACTION_QUICK_CONTACT = "android.provider.action.QUICK_CONTACT";
        public static final String EXTRA_EXCLUDE_MIMES = "android.provider.extra.EXCLUDE_MIMES";
        public static final String EXTRA_MODE = "android.provider.extra.MODE";
        public static final String EXTRA_PRIORITIZED_MIMETYPE = "android.provider.extra.PRIORITIZED_MIMETYPE";
        public static final int MODE_LARGE = 3;
        public static final int MODE_MEDIUM = 2;
        public static final int MODE_SMALL = 1;
        
        public QuickContact() {
            throw new RuntimeException("Stub!");
        }
        
        public static void showQuickContact(final Context context, final View target, final Uri lookupUri, final int mode, final String[] excludeMimes) {
            throw new RuntimeException("Stub!");
        }
        
        public static void showQuickContact(final Context context, final Rect target, final Uri lookupUri, final int mode, final String[] excludeMimes) {
            throw new RuntimeException("Stub!");
        }
        
        public static void showQuickContact(final Context context, final View target, final Uri lookupUri, final String[] excludeMimes, final String prioritizedMimeType) {
            throw new RuntimeException("Stub!");
        }
        
        public static void showQuickContact(final Context context, final Rect target, final Uri lookupUri, final String[] excludeMimes, final String prioritizedMimeType) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class RawContacts implements BaseColumns, RawContactsColumns, ContactOptionsColumns, ContactNameColumns, SyncColumns
    {
        public static final int AGGREGATION_MODE_DEFAULT = 0;
        public static final int AGGREGATION_MODE_DISABLED = 3;
        @Deprecated
        public static final int AGGREGATION_MODE_IMMEDIATE = 1;
        public static final int AGGREGATION_MODE_SUSPENDED = 2;
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/raw_contact";
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/raw_contact";
        public static final Uri CONTENT_URI;
        
        RawContacts() {
            throw new RuntimeException("Stub!");
        }
        
        public static Uri getContactLookupUri(final ContentResolver resolver, final Uri rawContactUri) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public static String getLocalAccountName(@NonNull final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public static String getLocalAccountType(@NonNull final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        public static EntityIterator newEntityIterator(final Cursor cursor) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
        }
        
        public static final class Data implements BaseColumns, DataColumns
        {
            public static final String CONTENT_DIRECTORY = "data";
            
            Data() {
                throw new RuntimeException("Stub!");
            }
        }
        
        public static final class DisplayPhoto
        {
            public static final String CONTENT_DIRECTORY = "display_photo";
            
            DisplayPhoto() {
                throw new RuntimeException("Stub!");
            }
        }
        
        public static final class Entity implements BaseColumns, DataColumns
        {
            public static final String CONTENT_DIRECTORY = "entity";
            public static final String DATA_ID = "data_id";
            
            Entity() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class RawContactsEntity implements BaseColumns, DataColumns, RawContactsColumns
    {
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/raw_contact_entity";
        public static final Uri CONTENT_URI;
        public static final String DATA_ID = "data_id";
        public static final Uri PROFILE_CONTENT_URI;
        
        RawContactsEntity() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
            PROFILE_CONTENT_URI = null;
        }
    }
    
    public static class SearchSnippets
    {
        public static final String DEFERRED_SNIPPETING_KEY = "deferred_snippeting";
        public static final String SNIPPET = "snippet";
        
        public SearchSnippets() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Settings implements SettingsColumns
    {
        public static final String ACTION_SET_DEFAULT_ACCOUNT = "android.provider.action.SET_DEFAULT_ACCOUNT";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/setting";
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/setting";
        public static final Uri CONTENT_URI;
        
        Settings() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public static Account getDefaultAccount(@NonNull final ContentResolver resolver) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
        }
    }
    
    public static final class SimAccount implements Parcelable
    {
        public static final int ADN_EF_TYPE = 1;
        @NonNull
        public static final Creator<SimAccount> CREATOR;
        public static final int FDN_EF_TYPE = 2;
        public static final int SDN_EF_TYPE = 3;
        public static final int UNKNOWN_EF_TYPE = 0;
        
        SimAccount() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getAccountName() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getAccountType() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSimSlotIndex() {
            throw new RuntimeException("Stub!");
        }
        
        public int getEfType() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object obj) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(@NonNull final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public static final class SimContacts
    {
        public static final String ACTION_SIM_ACCOUNTS_CHANGED = "android.provider.action.SIM_ACCOUNTS_CHANGED";
        
        SimContacts() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static List<SimAccount> getSimAccounts(@NonNull final ContentResolver contentResolver) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class StatusUpdates implements StatusColumns, PresenceColumns
    {
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/status-update";
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/status-update";
        public static final Uri CONTENT_URI;
        public static final Uri PROFILE_CONTENT_URI;
        
        StatusUpdates() {
            throw new RuntimeException("Stub!");
        }
        
        public static final int getPresenceIconResourceId(final int status) {
            throw new RuntimeException("Stub!");
        }
        
        public static final int getPresencePrecedence(final int status) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
            PROFILE_CONTENT_URI = null;
        }
    }
    
    public static final class SyncState implements SyncStateContract.Columns
    {
        public static final String CONTENT_DIRECTORY = "syncstate";
        public static final Uri CONTENT_URI;
        
        SyncState() {
            throw new RuntimeException("Stub!");
        }
        
        public static byte[] get(final ContentProviderClient provider, final Account account) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public static Pair<Uri, byte[]> getWithUri(final ContentProviderClient provider, final Account account) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public static void set(final ContentProviderClient provider, final Account account, final byte[] data) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public static ContentProviderOperation newSetOperation(final Account account, final byte[] data) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
        }
    }
    
    protected interface SyncColumns extends BaseSyncColumns
    {
        public static final String ACCOUNT_NAME = "account_name";
        public static final String ACCOUNT_TYPE = "account_type";
        public static final String DIRTY = "dirty";
        public static final String SOURCE_ID = "sourceid";
        public static final String VERSION = "version";
    }
    
    protected interface BaseSyncColumns
    {
        public static final String SYNC1 = "sync1";
        public static final String SYNC2 = "sync2";
        public static final String SYNC3 = "sync3";
        public static final String SYNC4 = "sync4";
    }
    
    protected interface StatusColumns
    {
        public static final int AVAILABLE = 5;
        public static final int AWAY = 2;
        public static final int CAPABILITY_HAS_CAMERA = 4;
        public static final int CAPABILITY_HAS_VIDEO = 2;
        public static final int CAPABILITY_HAS_VOICE = 1;
        public static final String CHAT_CAPABILITY = "chat_capability";
        public static final int DO_NOT_DISTURB = 4;
        public static final int IDLE = 3;
        public static final int INVISIBLE = 1;
        public static final int OFFLINE = 0;
        public static final String PRESENCE = "mode";
        @Deprecated
        public static final String PRESENCE_CUSTOM_STATUS = "status";
        @Deprecated
        public static final String PRESENCE_STATUS = "mode";
        public static final String STATUS = "status";
        public static final String STATUS_ICON = "status_icon";
        public static final String STATUS_LABEL = "status_label";
        public static final String STATUS_RES_PACKAGE = "status_res_package";
        public static final String STATUS_TIMESTAMP = "status_ts";
    }
    
    protected interface PresenceColumns
    {
        public static final String CUSTOM_PROTOCOL = "custom_protocol";
        public static final String DATA_ID = "presence_data_id";
        public static final String IM_ACCOUNT = "im_account";
        public static final String IM_HANDLE = "im_handle";
        public static final String PROTOCOL = "protocol";
    }
    
    protected interface SettingsColumns
    {
        public static final String ACCOUNT_NAME = "account_name";
        public static final String ACCOUNT_TYPE = "account_type";
        public static final String ANY_UNSYNCED = "any_unsynced";
        public static final String DATA_SET = "data_set";
        public static final String SHOULD_SYNC = "should_sync";
        public static final String UNGROUPED_COUNT = "summ_count";
        public static final String UNGROUPED_VISIBLE = "ungrouped_visible";
        public static final String UNGROUPED_WITH_PHONES = "summ_phones";
    }
    
    protected interface DataColumns
    {
        @Deprecated
        public static final String CARRIER_PRESENCE = "carrier_presence";
        @Deprecated
        public static final int CARRIER_PRESENCE_VT_CAPABLE = 1;
        public static final String DATA1 = "data1";
        public static final String DATA10 = "data10";
        public static final String DATA11 = "data11";
        public static final String DATA12 = "data12";
        public static final String DATA13 = "data13";
        public static final String DATA14 = "data14";
        public static final String DATA15 = "data15";
        public static final String DATA2 = "data2";
        public static final String DATA3 = "data3";
        public static final String DATA4 = "data4";
        public static final String DATA5 = "data5";
        public static final String DATA6 = "data6";
        public static final String DATA7 = "data7";
        public static final String DATA8 = "data8";
        public static final String DATA9 = "data9";
        public static final String DATA_VERSION = "data_version";
        public static final String IS_PRIMARY = "is_primary";
        public static final String IS_READ_ONLY = "is_read_only";
        public static final String IS_SUPER_PRIMARY = "is_super_primary";
        public static final String MIMETYPE = "mimetype";
        public static final String PREFERRED_PHONE_ACCOUNT_COMPONENT_NAME = "preferred_phone_account_component_name";
        public static final String PREFERRED_PHONE_ACCOUNT_ID = "preferred_phone_account_id";
        public static final String RAW_CONTACT_ID = "raw_contact_id";
        public static final String RES_PACKAGE = "res_package";
        public static final String SYNC1 = "data_sync1";
        public static final String SYNC2 = "data_sync2";
        public static final String SYNC3 = "data_sync3";
        public static final String SYNC4 = "data_sync4";
    }
    
    protected interface RawContactsColumns
    {
        public static final String ACCOUNT_TYPE_AND_DATA_SET = "account_type_and_data_set";
        public static final String AGGREGATION_MODE = "aggregation_mode";
        public static final String BACKUP_ID = "backup_id";
        public static final String CONTACT_ID = "contact_id";
        public static final String DATA_SET = "data_set";
        public static final String DELETED = "deleted";
        @Deprecated
        public static final String METADATA_DIRTY = "metadata_dirty";
        public static final String RAW_CONTACT_IS_READ_ONLY = "raw_contact_is_read_only";
        public static final String RAW_CONTACT_IS_USER_PROFILE = "raw_contact_is_user_profile";
    }
    
    protected interface ContactOptionsColumns
    {
        public static final String CUSTOM_RINGTONE = "custom_ringtone";
        @Deprecated
        public static final String LAST_TIME_CONTACTED = "last_time_contacted";
        public static final String PINNED = "pinned";
        public static final String SEND_TO_VOICEMAIL = "send_to_voicemail";
        public static final String STARRED = "starred";
        @Deprecated
        public static final String TIMES_CONTACTED = "times_contacted";
    }
    
    protected interface ContactNameColumns
    {
        public static final String DISPLAY_NAME_ALTERNATIVE = "display_name_alt";
        public static final String DISPLAY_NAME_PRIMARY = "display_name";
        public static final String DISPLAY_NAME_SOURCE = "display_name_source";
        public static final String PHONETIC_NAME = "phonetic_name";
        public static final String PHONETIC_NAME_STYLE = "phonetic_name_style";
        public static final String SORT_KEY_ALTERNATIVE = "sort_key_alt";
        public static final String SORT_KEY_PRIMARY = "sort_key";
    }
    
    protected interface ContactsColumns
    {
        public static final String CONTACT_LAST_UPDATED_TIMESTAMP = "contact_last_updated_timestamp";
        public static final String DISPLAY_NAME = "display_name";
        public static final String HAS_PHONE_NUMBER = "has_phone_number";
        public static final String IN_DEFAULT_DIRECTORY = "in_default_directory";
        public static final String IN_VISIBLE_GROUP = "in_visible_group";
        public static final String IS_USER_PROFILE = "is_user_profile";
        public static final String LOOKUP_KEY = "lookup";
        public static final String NAME_RAW_CONTACT_ID = "name_raw_contact_id";
        public static final String PHOTO_FILE_ID = "photo_file_id";
        public static final String PHOTO_ID = "photo_id";
        public static final String PHOTO_THUMBNAIL_URI = "photo_thumb_uri";
        public static final String PHOTO_URI = "photo_uri";
    }
    
    protected interface ContactStatusColumns
    {
        public static final String CONTACT_CHAT_CAPABILITY = "contact_chat_capability";
        public static final String CONTACT_PRESENCE = "contact_presence";
        public static final String CONTACT_STATUS = "contact_status";
        public static final String CONTACT_STATUS_ICON = "contact_status_icon";
        public static final String CONTACT_STATUS_LABEL = "contact_status_label";
        public static final String CONTACT_STATUS_RES_PACKAGE = "contact_status_res_package";
        public static final String CONTACT_STATUS_TIMESTAMP = "contact_status_ts";
    }
    
    public interface PhoneticNameStyle
    {
        public static final int JAPANESE = 4;
        public static final int KOREAN = 5;
        public static final int PINYIN = 3;
        public static final int UNDEFINED = 0;
    }
    
    protected interface PhoneLookupColumns
    {
        public static final String CONTACT_ID = "contact_id";
        public static final String DATA_ID = "data_id";
        public static final String LABEL = "label";
        public static final String NORMALIZED_NUMBER = "normalized_number";
        public static final String NUMBER = "number";
        public static final String TYPE = "type";
    }
    
    protected interface GroupsColumns
    {
        public static final String AUTO_ADD = "auto_add";
        public static final String DATA_SET = "data_set";
        public static final String DELETED = "deleted";
        public static final String FAVORITES = "favorites";
        public static final String GROUP_IS_READ_ONLY = "group_is_read_only";
        public static final String GROUP_VISIBLE = "group_visible";
        public static final String NOTES = "notes";
        public static final String RES_PACKAGE = "res_package";
        public static final String SHOULD_SYNC = "should_sync";
        public static final String SUMMARY_COUNT = "summ_count";
        public static final String SUMMARY_WITH_PHONES = "summ_phones";
        public static final String SYSTEM_ID = "system_id";
        public static final String TITLE = "title";
        public static final String TITLE_RES = "title_res";
    }
    
    public interface FullNameStyle
    {
        public static final int CHINESE = 3;
        public static final int CJK = 2;
        public static final int JAPANESE = 4;
        public static final int KOREAN = 5;
        public static final int UNDEFINED = 0;
        public static final int WESTERN = 1;
    }
    
    public interface DisplayNameSources
    {
        public static final int EMAIL = 10;
        public static final int NICKNAME = 35;
        public static final int ORGANIZATION = 30;
        public static final int PHONE = 20;
        public static final int STRUCTURED_NAME = 40;
        public static final int STRUCTURED_PHONETIC_NAME = 37;
        public static final int UNDEFINED = 0;
    }
    
    protected interface DeletedContactsColumns
    {
        public static final String CONTACT_DELETED_TIMESTAMP = "contact_deleted_timestamp";
        public static final String CONTACT_ID = "contact_id";
    }
    
    protected interface DataUsageStatColumns
    {
        @Deprecated
        public static final String LAST_TIME_USED = "last_time_used";
        @Deprecated
        public static final String TIMES_USED = "times_used";
    }
    
    protected interface DataColumnsWithJoins extends BaseColumns, DataColumns, StatusColumns, RawContactsColumns, ContactsColumns, ContactNameColumns, ContactOptionsColumns, ContactStatusColumns, DataUsageStatColumns
    {
    }
}
