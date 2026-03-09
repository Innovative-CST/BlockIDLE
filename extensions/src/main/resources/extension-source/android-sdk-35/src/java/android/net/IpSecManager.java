package android.net;

import android.util.AndroidException;
import java.io.FileDescriptor;
import java.net.DatagramSocket;
import java.io.IOException;
import java.net.Socket;
import java.net.InetAddress;

public class IpSecManager
{
    public static final int DIRECTION_IN = 0;
    public static final int DIRECTION_OUT = 1;
    
    IpSecManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SecurityParameterIndex allocateSecurityParameterIndex(@NonNull final InetAddress destinationAddress) throws ResourceUnavailableException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SecurityParameterIndex allocateSecurityParameterIndex(@NonNull final InetAddress destinationAddress, final int requestedSpi) throws ResourceUnavailableException, SpiUnavailableException {
        throw new RuntimeException("Stub!");
    }
    
    public void applyTransportModeTransform(@NonNull final Socket socket, final int direction, @NonNull final IpSecTransform transform) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void applyTransportModeTransform(@NonNull final DatagramSocket socket, final int direction, @NonNull final IpSecTransform transform) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void applyTransportModeTransform(@NonNull final FileDescriptor socket, final int direction, @NonNull final IpSecTransform transform) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void removeTransportModeTransforms(@NonNull final Socket socket) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void removeTransportModeTransforms(@NonNull final DatagramSocket socket) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void removeTransportModeTransforms(@NonNull final FileDescriptor socket) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public UdpEncapsulationSocket openUdpEncapsulationSocket(final int port) throws IOException, ResourceUnavailableException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public UdpEncapsulationSocket openUdpEncapsulationSocket() throws IOException, ResourceUnavailableException {
        throw new RuntimeException("Stub!");
    }
    
    public static final class ResourceUnavailableException extends AndroidException
    {
        ResourceUnavailableException() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class SecurityParameterIndex implements AutoCloseable
    {
        SecurityParameterIndex() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSpi() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void close() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        protected void finalize() throws Throwable {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class SpiUnavailableException extends AndroidException
    {
        SpiUnavailableException() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSpi() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class UdpEncapsulationSocket implements AutoCloseable
    {
        UdpEncapsulationSocket() {
            throw new RuntimeException("Stub!");
        }
        
        public FileDescriptor getFileDescriptor() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPort() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void close() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        protected void finalize() throws Throwable {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
