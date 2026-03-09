package org.json;

import java.util.Iterator;
import java.util.Map;

public class JSONObject
{
    @RecentlyNonNull
    public static final Object NULL;
    
    public JSONObject() {
        throw new RuntimeException("Stub!");
    }
    
    public JSONObject(@RecentlyNonNull final Map copyFrom) {
        throw new RuntimeException("Stub!");
    }
    
    public JSONObject(@RecentlyNonNull final JSONTokener readFrom) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    public JSONObject(@RecentlyNonNull final String json) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    public JSONObject(@RecentlyNonNull final JSONObject copyFrom, @RecentlyNonNull final String[] names) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    public int length() {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public JSONObject put(@RecentlyNonNull final String name, final boolean value) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public JSONObject put(@RecentlyNonNull final String name, final double value) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public JSONObject put(@RecentlyNonNull final String name, final int value) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public JSONObject put(@RecentlyNonNull final String name, final long value) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public JSONObject put(@RecentlyNonNull final String name, @RecentlyNullable final Object value) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public JSONObject putOpt(@RecentlyNullable final String name, @RecentlyNullable final Object value) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public JSONObject accumulate(@RecentlyNonNull final String name, @RecentlyNullable final Object value) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public JSONObject append(@RecentlyNonNull final String name, @RecentlyNullable final Object value) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNullable
    public Object remove(@RecentlyNullable final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNull(@RecentlyNullable final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean has(@RecentlyNullable final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public Object get(@RecentlyNonNull final String name) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNullable
    public Object opt(@RecentlyNullable final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getBoolean(@RecentlyNonNull final String name) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean optBoolean(@RecentlyNullable final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean optBoolean(@RecentlyNullable final String name, final boolean fallback) {
        throw new RuntimeException("Stub!");
    }
    
    public double getDouble(@RecentlyNonNull final String name) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    public double optDouble(@RecentlyNullable final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public double optDouble(@RecentlyNullable final String name, final double fallback) {
        throw new RuntimeException("Stub!");
    }
    
    public int getInt(@RecentlyNonNull final String name) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    public int optInt(@RecentlyNullable final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public int optInt(@RecentlyNullable final String name, final int fallback) {
        throw new RuntimeException("Stub!");
    }
    
    public long getLong(@RecentlyNonNull final String name) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    public long optLong(@RecentlyNullable final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public long optLong(@RecentlyNullable final String name, final long fallback) {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public String getString(@RecentlyNonNull final String name) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public String optString(@RecentlyNullable final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public String optString(@RecentlyNullable final String name, @RecentlyNonNull final String fallback) {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public JSONArray getJSONArray(@RecentlyNonNull final String name) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNullable
    public JSONArray optJSONArray(@RecentlyNullable final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public JSONObject getJSONObject(@RecentlyNonNull final String name) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNullable
    public JSONObject optJSONObject(@RecentlyNullable final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNullable
    public JSONArray toJSONArray(@RecentlyNullable final JSONArray names) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public Iterator<String> keys() {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNullable
    public JSONArray names() {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public String toString(final int indentSpaces) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public static String numberToString(@RecentlyNonNull final Number number) throws JSONException {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    public static String quote(@RecentlyNullable final String data) {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNullable
    public static Object wrap(@RecentlyNullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        NULL = null;
    }
}
