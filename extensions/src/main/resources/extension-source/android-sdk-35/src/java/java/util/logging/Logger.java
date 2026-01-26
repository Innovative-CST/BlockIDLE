package java.util.logging;

import java.util.ResourceBundle;
import java.util.function.Supplier;

public class Logger {
	@RecentlyNonNull
	public static final String GLOBAL_LOGGER_NAME = "global";
	@Deprecated
	@RecentlyNonNull
	public static final Logger global;

	protected Logger(@RecentlyNullable final String name, @RecentlyNullable final String resourceBundleName) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final Logger getGlobal() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Logger getLogger(@RecentlyNonNull final String name) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Logger getLogger(@RecentlyNonNull final String name,
			@RecentlyNullable final String resourceBundleName) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Logger getAnonymousLogger() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Logger getAnonymousLogger(@RecentlyNullable final String resourceBundleName) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public ResourceBundle getResourceBundle() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public String getResourceBundleName() {
		throw new RuntimeException("Stub!");
	}

	public void setFilter(@RecentlyNullable final Filter newFilter) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public Filter getFilter() {
		throw new RuntimeException("Stub!");
	}

	public void log(@RecentlyNonNull final LogRecord record) {
		throw new RuntimeException("Stub!");
	}

	public void log(@RecentlyNonNull final Level level, @RecentlyNullable final String msg) {
		throw new RuntimeException("Stub!");
	}

	public void log(@RecentlyNonNull final Level level, @RecentlyNonNull final Supplier<String> msgSupplier) {
		throw new RuntimeException("Stub!");
	}

	public void log(@RecentlyNonNull final Level level, @RecentlyNullable final String msg,
			@RecentlyNullable final Object param1) {
		throw new RuntimeException("Stub!");
	}

	public void log(@RecentlyNonNull final Level level, @RecentlyNullable final String msg,
			@RecentlyNullable final Object[] params) {
		throw new RuntimeException("Stub!");
	}

	public void log(@RecentlyNonNull final Level level, @RecentlyNullable final String msg,
			@RecentlyNullable final Throwable thrown) {
		throw new RuntimeException("Stub!");
	}

	public void log(@RecentlyNonNull final Level level, @RecentlyNullable final Throwable thrown,
			@RecentlyNonNull final Supplier<String> msgSupplier) {
		throw new RuntimeException("Stub!");
	}

	public void logp(@RecentlyNonNull final Level level, @RecentlyNullable final String sourceClass,
			@RecentlyNullable final String sourceMethod, @RecentlyNullable final String msg) {
		throw new RuntimeException("Stub!");
	}

	public void logp(@RecentlyNonNull final Level level, @RecentlyNullable final String sourceClass,
			@RecentlyNullable final String sourceMethod, @RecentlyNonNull final Supplier<String> msgSupplier) {
		throw new RuntimeException("Stub!");
	}

	public void logp(@RecentlyNonNull final Level level, @RecentlyNullable final String sourceClass,
			@RecentlyNullable final String sourceMethod, @RecentlyNullable final String msg,
			@RecentlyNullable final Object param1) {
		throw new RuntimeException("Stub!");
	}

	public void logp(@RecentlyNonNull final Level level, @RecentlyNullable final String sourceClass,
			@RecentlyNullable final String sourceMethod, @RecentlyNullable final String msg,
			@RecentlyNullable final Object[] params) {
		throw new RuntimeException("Stub!");
	}

	public void logp(@RecentlyNonNull final Level level, @RecentlyNullable final String sourceClass,
			@RecentlyNullable final String sourceMethod, @RecentlyNullable final String msg,
			@RecentlyNullable final Throwable thrown) {
		throw new RuntimeException("Stub!");
	}

	public void logp(@RecentlyNonNull final Level level, @RecentlyNullable final String sourceClass,
			@RecentlyNullable final String sourceMethod, @RecentlyNullable final Throwable thrown,
			@RecentlyNonNull final Supplier<String> msgSupplier) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void logrb(@RecentlyNonNull final Level level, @RecentlyNullable final String sourceClass,
			@RecentlyNullable final String sourceMethod, @RecentlyNullable final String bundleName,
			@RecentlyNullable final String msg) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void logrb(@RecentlyNonNull final Level level, @RecentlyNullable final String sourceClass,
			@RecentlyNullable final String sourceMethod, @RecentlyNullable final String bundleName,
			@RecentlyNullable final String msg, @RecentlyNullable final Object param1) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void logrb(@RecentlyNonNull final Level level, @RecentlyNullable final String sourceClass,
			@RecentlyNullable final String sourceMethod, @RecentlyNullable final String bundleName,
			@RecentlyNullable final String msg, @RecentlyNullable final Object[] params) {
		throw new RuntimeException("Stub!");
	}

	public void logrb(@RecentlyNonNull final Level level, @RecentlyNullable final String sourceClass,
			@RecentlyNullable final String sourceMethod, @RecentlyNullable final ResourceBundle bundle,
			@RecentlyNullable final String msg, @RecentlyNullable final Object... params) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void logrb(@RecentlyNonNull final Level level, @RecentlyNullable final String sourceClass,
			@RecentlyNullable final String sourceMethod, @RecentlyNullable final String bundleName,
			@RecentlyNullable final String msg, @RecentlyNullable final Throwable thrown) {
		throw new RuntimeException("Stub!");
	}

	public void logrb(@RecentlyNonNull final Level level, @RecentlyNullable final String sourceClass,
			@RecentlyNullable final String sourceMethod, @RecentlyNullable final ResourceBundle bundle,
			@RecentlyNullable final String msg, @RecentlyNullable final Throwable thrown) {
		throw new RuntimeException("Stub!");
	}

	public void entering(@RecentlyNullable final String sourceClass, @RecentlyNullable final String sourceMethod) {
		throw new RuntimeException("Stub!");
	}

	public void entering(@RecentlyNullable final String sourceClass, @RecentlyNullable final String sourceMethod,
			@RecentlyNullable final Object param1) {
		throw new RuntimeException("Stub!");
	}

	public void entering(@RecentlyNullable final String sourceClass, @RecentlyNullable final String sourceMethod,
			@RecentlyNullable final Object[] params) {
		throw new RuntimeException("Stub!");
	}

	public void exiting(@RecentlyNullable final String sourceClass, @RecentlyNullable final String sourceMethod) {
		throw new RuntimeException("Stub!");
	}

	public void exiting(@RecentlyNullable final String sourceClass, @RecentlyNullable final String sourceMethod,
			@RecentlyNullable final Object result) {
		throw new RuntimeException("Stub!");
	}

	public void throwing(@RecentlyNullable final String sourceClass, @RecentlyNullable final String sourceMethod,
			@RecentlyNullable final Throwable thrown) {
		throw new RuntimeException("Stub!");
	}

	public void severe(@RecentlyNullable final String msg) {
		throw new RuntimeException("Stub!");
	}

	public void warning(@RecentlyNullable final String msg) {
		throw new RuntimeException("Stub!");
	}

	public void info(@RecentlyNullable final String msg) {
		throw new RuntimeException("Stub!");
	}

	public void config(@RecentlyNullable final String msg) {
		throw new RuntimeException("Stub!");
	}

	public void fine(@RecentlyNullable final String msg) {
		throw new RuntimeException("Stub!");
	}

	public void finer(@RecentlyNullable final String msg) {
		throw new RuntimeException("Stub!");
	}

	public void finest(@RecentlyNullable final String msg) {
		throw new RuntimeException("Stub!");
	}

	public void severe(@RecentlyNonNull final Supplier<String> msgSupplier) {
		throw new RuntimeException("Stub!");
	}

	public void warning(@RecentlyNonNull final Supplier<String> msgSupplier) {
		throw new RuntimeException("Stub!");
	}

	public void info(@RecentlyNonNull final Supplier<String> msgSupplier) {
		throw new RuntimeException("Stub!");
	}

	public void config(@RecentlyNonNull final Supplier<String> msgSupplier) {
		throw new RuntimeException("Stub!");
	}

	public void fine(@RecentlyNonNull final Supplier<String> msgSupplier) {
		throw new RuntimeException("Stub!");
	}

	public void finer(@RecentlyNonNull final Supplier<String> msgSupplier) {
		throw new RuntimeException("Stub!");
	}

	public void finest(@RecentlyNonNull final Supplier<String> msgSupplier) {
		throw new RuntimeException("Stub!");
	}

	public void setLevel(@RecentlyNullable final Level newLevel) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public Level getLevel() {
		throw new RuntimeException("Stub!");
	}

	public boolean isLoggable(@RecentlyNonNull final Level level) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public String getName() {
		throw new RuntimeException("Stub!");
	}

	public void addHandler(@RecentlyNonNull final Handler handler) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	public void removeHandler(@RecentlyNullable final Handler handler) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Handler[] getHandlers() {
		throw new RuntimeException("Stub!");
	}

	public void setUseParentHandlers(final boolean useParentHandlers) {
		throw new RuntimeException("Stub!");
	}

	public boolean getUseParentHandlers() {
		throw new RuntimeException("Stub!");
	}

	public void setResourceBundle(@RecentlyNonNull final ResourceBundle bundle) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public Logger getParent() {
		throw new RuntimeException("Stub!");
	}

	public void setParent(@RecentlyNonNull final Logger parent) {
		throw new RuntimeException("Stub!");
	}

	static {
		global = null;
	}
}
