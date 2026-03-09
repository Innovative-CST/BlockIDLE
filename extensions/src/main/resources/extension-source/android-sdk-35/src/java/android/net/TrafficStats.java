package android.net;

import java.io.IOException;
import java.io.FileDescriptor;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.Socket;

public class TrafficStats
{
    public static final int UNSUPPORTED = -1;
    
    public TrafficStats() {
        throw new RuntimeException("Stub!");
    }
    
    public static void setThreadStatsTag(final int tag) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getAndSetThreadStatsTag(final int tag) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getThreadStatsTag() {
        throw new RuntimeException("Stub!");
    }
    
    public static void clearThreadStatsTag() {
        throw new RuntimeException("Stub!");
    }
    
    public static void setThreadStatsUid(final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getThreadStatsUid() {
        throw new RuntimeException("Stub!");
    }
    
    public static void clearThreadStatsUid() {
        throw new RuntimeException("Stub!");
    }
    
    public static void tagSocket(@NonNull final Socket socket) throws SocketException {
        throw new RuntimeException("Stub!");
    }
    
    public static void untagSocket(@NonNull final Socket socket) throws SocketException {
        throw new RuntimeException("Stub!");
    }
    
    public static void tagDatagramSocket(@NonNull final DatagramSocket socket) throws SocketException {
        throw new RuntimeException("Stub!");
    }
    
    public static void untagDatagramSocket(@NonNull final DatagramSocket socket) throws SocketException {
        throw new RuntimeException("Stub!");
    }
    
    public static void tagFileDescriptor(@NonNull final FileDescriptor fd) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static void untagFileDescriptor(@NonNull final FileDescriptor fd) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static void incrementOperationCount(final int operationCount) {
        throw new RuntimeException("Stub!");
    }
    
    public static void incrementOperationCount(final int tag, final int operationCount) {
        throw new RuntimeException("Stub!");
    }
    
    public static long getMobileTxPackets() {
        throw new RuntimeException("Stub!");
    }
    
    public static long getMobileRxPackets() {
        throw new RuntimeException("Stub!");
    }
    
    public static long getMobileTxBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public static long getMobileRxBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public static long getTxPackets(@NonNull final String iface) {
        throw new RuntimeException("Stub!");
    }
    
    public static long getRxPackets(@NonNull final String iface) {
        throw new RuntimeException("Stub!");
    }
    
    public static long getTxBytes(@NonNull final String iface) {
        throw new RuntimeException("Stub!");
    }
    
    public static long getRxBytes(@NonNull final String iface) {
        throw new RuntimeException("Stub!");
    }
    
    public static long getTotalTxPackets() {
        throw new RuntimeException("Stub!");
    }
    
    public static long getTotalRxPackets() {
        throw new RuntimeException("Stub!");
    }
    
    public static long getTotalTxBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public static long getTotalRxBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public static long getUidTxBytes(final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    public static long getUidRxBytes(final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    public static long getUidTxPackets(final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    public static long getUidRxPackets(final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static long getUidTcpTxBytes(final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static long getUidTcpRxBytes(final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static long getUidUdpTxBytes(final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static long getUidUdpRxBytes(final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static long getUidTcpTxSegments(final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static long getUidTcpRxSegments(final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static long getUidUdpTxPackets(final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static long getUidUdpRxPackets(final int uid) {
        throw new RuntimeException("Stub!");
    }
}
