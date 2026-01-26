package android.media.audiofx;

public final class DynamicsProcessing extends AudioEffect
{
    public static final int VARIANT_FAVOR_FREQUENCY_RESOLUTION = 0;
    public static final int VARIANT_FAVOR_TIME_RESOLUTION = 1;
    
    public DynamicsProcessing(final int audioSession) {
        throw new RuntimeException("Stub!");
    }
    
    public DynamicsProcessing(final int priority, final int audioSession, @Nullable final Config cfg) {
        throw new RuntimeException("Stub!");
    }
    
    public Config getConfig() {
        throw new RuntimeException("Stub!");
    }
    
    public Channel getChannelByChannelIndex(final int channelIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public void setChannelTo(final int channelIndex, final Channel channel) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAllChannelsTo(final Channel channel) {
        throw new RuntimeException("Stub!");
    }
    
    public float getInputGainByChannelIndex(final int channelIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInputGainbyChannel(final int channelIndex, final float inputGain) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInputGainAllChannelsTo(final float inputGain) {
        throw new RuntimeException("Stub!");
    }
    
    public Eq getPreEqByChannelIndex(final int channelIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPreEqByChannelIndex(final int channelIndex, final Eq preEq) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPreEqAllChannelsTo(final Eq preEq) {
        throw new RuntimeException("Stub!");
    }
    
    public EqBand getPreEqBandByChannelIndex(final int channelIndex, final int band) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPreEqBandByChannelIndex(final int channelIndex, final int band, final EqBand preEqBand) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPreEqBandAllChannelsTo(final int band, final EqBand preEqBand) {
        throw new RuntimeException("Stub!");
    }
    
    public Mbc getMbcByChannelIndex(final int channelIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMbcByChannelIndex(final int channelIndex, final Mbc mbc) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMbcAllChannelsTo(final Mbc mbc) {
        throw new RuntimeException("Stub!");
    }
    
    public MbcBand getMbcBandByChannelIndex(final int channelIndex, final int band) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMbcBandByChannelIndex(final int channelIndex, final int band, final MbcBand mbcBand) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMbcBandAllChannelsTo(final int band, final MbcBand mbcBand) {
        throw new RuntimeException("Stub!");
    }
    
    public Eq getPostEqByChannelIndex(final int channelIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPostEqByChannelIndex(final int channelIndex, final Eq postEq) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPostEqAllChannelsTo(final Eq postEq) {
        throw new RuntimeException("Stub!");
    }
    
    public EqBand getPostEqBandByChannelIndex(final int channelIndex, final int band) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPostEqBandByChannelIndex(final int channelIndex, final int band, final EqBand postEqBand) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPostEqBandAllChannelsTo(final int band, final EqBand postEqBand) {
        throw new RuntimeException("Stub!");
    }
    
    public Limiter getLimiterByChannelIndex(final int channelIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLimiterByChannelIndex(final int channelIndex, final Limiter limiter) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLimiterAllChannelsTo(final Limiter limiter) {
        throw new RuntimeException("Stub!");
    }
    
    public int getChannelCount() {
        throw new RuntimeException("Stub!");
    }
    
    public static class BandBase
    {
        public BandBase(final boolean enabled, final float cutoffFrequency) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isEnabled() {
            throw new RuntimeException("Stub!");
        }
        
        public void setEnabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        public float getCutoffFrequency() {
            throw new RuntimeException("Stub!");
        }
        
        public void setCutoffFrequency(final float frequency) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class BandStage extends Stage
    {
        public BandStage(final boolean inUse, final boolean enabled, final int bandCount) {
            super(false, false);
            throw new RuntimeException("Stub!");
        }
        
        public int getBandCount() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Channel
    {
        public Channel(final float inputGain, final boolean preEqInUse, final int preEqBandCount, final boolean mbcInUse, final int mbcBandCount, final boolean postEqInUse, final int postEqBandCount, final boolean limiterInUse) {
            throw new RuntimeException("Stub!");
        }
        
        public Channel(final Channel cfg) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        public float getInputGain() {
            throw new RuntimeException("Stub!");
        }
        
        public void setInputGain(final float inputGain) {
            throw new RuntimeException("Stub!");
        }
        
        public Eq getPreEq() {
            throw new RuntimeException("Stub!");
        }
        
        public void setPreEq(final Eq preEq) {
            throw new RuntimeException("Stub!");
        }
        
        public EqBand getPreEqBand(final int band) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPreEqBand(final int band, final EqBand preEqBand) {
            throw new RuntimeException("Stub!");
        }
        
        public Mbc getMbc() {
            throw new RuntimeException("Stub!");
        }
        
        public void setMbc(final Mbc mbc) {
            throw new RuntimeException("Stub!");
        }
        
        public MbcBand getMbcBand(final int band) {
            throw new RuntimeException("Stub!");
        }
        
        public void setMbcBand(final int band, final MbcBand mbcBand) {
            throw new RuntimeException("Stub!");
        }
        
        public Eq getPostEq() {
            throw new RuntimeException("Stub!");
        }
        
        public void setPostEq(final Eq postEq) {
            throw new RuntimeException("Stub!");
        }
        
        public EqBand getPostEqBand(final int band) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPostEqBand(final int band, final EqBand postEqBand) {
            throw new RuntimeException("Stub!");
        }
        
        public Limiter getLimiter() {
            throw new RuntimeException("Stub!");
        }
        
        public void setLimiter(final Limiter limiter) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Config
    {
        Config() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        public int getVariant() {
            throw new RuntimeException("Stub!");
        }
        
        public float getPreferredFrameDuration() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isPreEqInUse() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPreEqBandCount() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isMbcInUse() {
            throw new RuntimeException("Stub!");
        }
        
        public int getMbcBandCount() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isPostEqInUse() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPostEqBandCount() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isLimiterInUse() {
            throw new RuntimeException("Stub!");
        }
        
        public Channel getChannelByChannelIndex(final int channelIndex) {
            throw new RuntimeException("Stub!");
        }
        
        public void setChannelTo(final int channelIndex, final Channel channel) {
            throw new RuntimeException("Stub!");
        }
        
        public void setAllChannelsTo(final Channel channel) {
            throw new RuntimeException("Stub!");
        }
        
        public float getInputGainByChannelIndex(final int channelIndex) {
            throw new RuntimeException("Stub!");
        }
        
        public void setInputGainByChannelIndex(final int channelIndex, final float inputGain) {
            throw new RuntimeException("Stub!");
        }
        
        public void setInputGainAllChannelsTo(final float inputGain) {
            throw new RuntimeException("Stub!");
        }
        
        public Eq getPreEqByChannelIndex(final int channelIndex) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPreEqByChannelIndex(final int channelIndex, final Eq preEq) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPreEqAllChannelsTo(final Eq preEq) {
            throw new RuntimeException("Stub!");
        }
        
        public EqBand getPreEqBandByChannelIndex(final int channelIndex, final int band) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPreEqBandByChannelIndex(final int channelIndex, final int band, final EqBand preEqBand) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPreEqBandAllChannelsTo(final int band, final EqBand preEqBand) {
            throw new RuntimeException("Stub!");
        }
        
        public Mbc getMbcByChannelIndex(final int channelIndex) {
            throw new RuntimeException("Stub!");
        }
        
        public void setMbcByChannelIndex(final int channelIndex, final Mbc mbc) {
            throw new RuntimeException("Stub!");
        }
        
        public void setMbcAllChannelsTo(final Mbc mbc) {
            throw new RuntimeException("Stub!");
        }
        
        public MbcBand getMbcBandByChannelIndex(final int channelIndex, final int band) {
            throw new RuntimeException("Stub!");
        }
        
        public void setMbcBandByChannelIndex(final int channelIndex, final int band, final MbcBand mbcBand) {
            throw new RuntimeException("Stub!");
        }
        
        public void setMbcBandAllChannelsTo(final int band, final MbcBand mbcBand) {
            throw new RuntimeException("Stub!");
        }
        
        public Eq getPostEqByChannelIndex(final int channelIndex) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPostEqByChannelIndex(final int channelIndex, final Eq postEq) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPostEqAllChannelsTo(final Eq postEq) {
            throw new RuntimeException("Stub!");
        }
        
        public EqBand getPostEqBandByChannelIndex(final int channelIndex, final int band) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPostEqBandByChannelIndex(final int channelIndex, final int band, final EqBand postEqBand) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPostEqBandAllChannelsTo(final int band, final EqBand postEqBand) {
            throw new RuntimeException("Stub!");
        }
        
        public Limiter getLimiterByChannelIndex(final int channelIndex) {
            throw new RuntimeException("Stub!");
        }
        
        public void setLimiterByChannelIndex(final int channelIndex, final Limiter limiter) {
            throw new RuntimeException("Stub!");
        }
        
        public void setLimiterAllChannelsTo(final Limiter limiter) {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Builder
        {
            public Builder(final int variant, final int channelCount, final boolean preEqInUse, final int preEqBandCount, final boolean mbcInUse, final int mbcBandCount, final boolean postEqInUse, final int postEqBandCount, final boolean limiterInUse) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setPreferredFrameDuration(final float frameDuration) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setInputGainByChannelIndex(final int channelIndex, final float inputGain) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setInputGainAllChannelsTo(final float inputGain) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setChannelTo(final int channelIndex, final Channel channel) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setAllChannelsTo(final Channel channel) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setPreEqByChannelIndex(final int channelIndex, final Eq preEq) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setPreEqAllChannelsTo(final Eq preEq) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setMbcByChannelIndex(final int channelIndex, final Mbc mbc) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setMbcAllChannelsTo(final Mbc mbc) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setPostEqByChannelIndex(final int channelIndex, final Eq postEq) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setPostEqAllChannelsTo(final Eq postEq) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setLimiterByChannelIndex(final int channelIndex, final Limiter limiter) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setLimiterAllChannelsTo(final Limiter limiter) {
                throw new RuntimeException("Stub!");
            }
            
            public Config build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class Eq extends BandStage
    {
        public Eq(final boolean inUse, final boolean enabled, final int bandCount) {
            super(false, false, 0);
            throw new RuntimeException("Stub!");
        }
        
        public Eq(final Eq cfg) {
            super(false, false, 0);
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        public void setBand(final int band, final EqBand bandCfg) {
            throw new RuntimeException("Stub!");
        }
        
        public EqBand getBand(final int band) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class EqBand extends BandBase
    {
        public EqBand(final boolean enabled, final float cutoffFrequency, final float gain) {
            super(false, 0.0f);
            throw new RuntimeException("Stub!");
        }
        
        public EqBand(final EqBand cfg) {
            super(false, 0.0f);
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        public float getGain() {
            throw new RuntimeException("Stub!");
        }
        
        public void setGain(final float gain) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Limiter extends Stage
    {
        public Limiter(final boolean inUse, final boolean enabled, final int linkGroup, final float attackTime, final float releaseTime, final float ratio, final float threshold, final float postGain) {
            super(false, false);
            throw new RuntimeException("Stub!");
        }
        
        public Limiter(final Limiter cfg) {
            super(false, false);
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        public int getLinkGroup() {
            throw new RuntimeException("Stub!");
        }
        
        public void setLinkGroup(final int linkGroup) {
            throw new RuntimeException("Stub!");
        }
        
        public float getAttackTime() {
            throw new RuntimeException("Stub!");
        }
        
        public void setAttackTime(final float attackTime) {
            throw new RuntimeException("Stub!");
        }
        
        public float getReleaseTime() {
            throw new RuntimeException("Stub!");
        }
        
        public void setReleaseTime(final float releaseTime) {
            throw new RuntimeException("Stub!");
        }
        
        public float getRatio() {
            throw new RuntimeException("Stub!");
        }
        
        public void setRatio(final float ratio) {
            throw new RuntimeException("Stub!");
        }
        
        public float getThreshold() {
            throw new RuntimeException("Stub!");
        }
        
        public void setThreshold(final float threshold) {
            throw new RuntimeException("Stub!");
        }
        
        public float getPostGain() {
            throw new RuntimeException("Stub!");
        }
        
        public void setPostGain(final float postGain) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Mbc extends BandStage
    {
        public Mbc(final boolean inUse, final boolean enabled, final int bandCount) {
            super(false, false, 0);
            throw new RuntimeException("Stub!");
        }
        
        public Mbc(final Mbc cfg) {
            super(false, false, 0);
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        public void setBand(final int band, final MbcBand bandCfg) {
            throw new RuntimeException("Stub!");
        }
        
        public MbcBand getBand(final int band) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class MbcBand extends BandBase
    {
        public MbcBand(final boolean enabled, final float cutoffFrequency, final float attackTime, final float releaseTime, final float ratio, final float threshold, final float kneeWidth, final float noiseGateThreshold, final float expanderRatio, final float preGain, final float postGain) {
            super(false, 0.0f);
            throw new RuntimeException("Stub!");
        }
        
        public MbcBand(final MbcBand cfg) {
            super(false, 0.0f);
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        public float getAttackTime() {
            throw new RuntimeException("Stub!");
        }
        
        public void setAttackTime(final float attackTime) {
            throw new RuntimeException("Stub!");
        }
        
        public float getReleaseTime() {
            throw new RuntimeException("Stub!");
        }
        
        public void setReleaseTime(final float releaseTime) {
            throw new RuntimeException("Stub!");
        }
        
        public float getRatio() {
            throw new RuntimeException("Stub!");
        }
        
        public void setRatio(final float ratio) {
            throw new RuntimeException("Stub!");
        }
        
        public float getThreshold() {
            throw new RuntimeException("Stub!");
        }
        
        public void setThreshold(final float threshold) {
            throw new RuntimeException("Stub!");
        }
        
        public float getKneeWidth() {
            throw new RuntimeException("Stub!");
        }
        
        public void setKneeWidth(final float kneeWidth) {
            throw new RuntimeException("Stub!");
        }
        
        public float getNoiseGateThreshold() {
            throw new RuntimeException("Stub!");
        }
        
        public void setNoiseGateThreshold(final float noiseGateThreshold) {
            throw new RuntimeException("Stub!");
        }
        
        public float getExpanderRatio() {
            throw new RuntimeException("Stub!");
        }
        
        public void setExpanderRatio(final float expanderRatio) {
            throw new RuntimeException("Stub!");
        }
        
        public float getPreGain() {
            throw new RuntimeException("Stub!");
        }
        
        public void setPreGain(final float preGain) {
            throw new RuntimeException("Stub!");
        }
        
        public float getPostGain() {
            throw new RuntimeException("Stub!");
        }
        
        public void setPostGain(final float postGain) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class Stage
    {
        public Stage(final boolean inUse, final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isEnabled() {
            throw new RuntimeException("Stub!");
        }
        
        public void setEnabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isInUse() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
