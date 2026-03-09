package android.telephony;

import java.util.concurrent.Executor;
import android.os.PersistableBundle;

public class CarrierConfigManager
{
    public static final String ACTION_CARRIER_CONFIG_CHANGED = "android.telephony.action.CARRIER_CONFIG_CHANGED";
    public static final int CARRIER_NR_AVAILABILITY_NSA = 1;
    public static final int CARRIER_NR_AVAILABILITY_SA = 2;
    public static final int CROSS_SIM_SPN_FORMAT_CARRIER_NAME_ONLY = 0;
    public static final int CROSS_SIM_SPN_FORMAT_CARRIER_NAME_WITH_BRANDING = 1;
    public static final int DATA_CYCLE_THRESHOLD_DISABLED = -2;
    public static final int DATA_CYCLE_USE_PLATFORM_DEFAULT = -1;
    public static final String ENABLE_EAP_METHOD_PREFIX_BOOL = "enable_eap_method_prefix_bool";
    public static final String EXTRA_REBROADCAST_ON_UNLOCK = "android.telephony.extra.REBROADCAST_ON_UNLOCK";
    public static final String EXTRA_SLOT_INDEX = "android.telephony.extra.SLOT_INDEX";
    public static final String EXTRA_SUBSCRIPTION_INDEX = "android.telephony.extra.SUBSCRIPTION_INDEX";
    public static final String IMSI_KEY_AVAILABILITY_INT = "imsi_key_availability_int";
    public static final String KEY_5G_NR_SSRSRP_THRESHOLDS_INT_ARRAY = "5g_nr_ssrsrp_thresholds_int_array";
    public static final String KEY_5G_NR_SSRSRQ_THRESHOLDS_INT_ARRAY = "5g_nr_ssrsrq_thresholds_int_array";
    public static final String KEY_5G_NR_SSSINR_THRESHOLDS_INT_ARRAY = "5g_nr_sssinr_thresholds_int_array";
    public static final String KEY_ADDITIONAL_CALL_SETTING_BOOL = "additional_call_setting_bool";
    public static final String KEY_ADDITIONAL_SETTINGS_CALLER_ID_VISIBILITY_BOOL = "additional_settings_caller_id_visibility_bool";
    public static final String KEY_ADDITIONAL_SETTINGS_CALL_WAITING_VISIBILITY_BOOL = "additional_settings_call_waiting_visibility_bool";
    public static final String KEY_ALLOW_ADDING_APNS_BOOL = "allow_adding_apns_bool";
    public static final String KEY_ALLOW_ADD_CALL_DURING_VIDEO_CALL_BOOL = "allow_add_call_during_video_call";
    public static final String KEY_ALLOW_EMERGENCY_NUMBERS_IN_CALL_LOG_BOOL = "allow_emergency_numbers_in_call_log_bool";
    public static final String KEY_ALLOW_EMERGENCY_VIDEO_CALLS_BOOL = "allow_emergency_video_calls_bool";
    public static final String KEY_ALLOW_HOLD_CALL_DURING_EMERGENCY_BOOL = "allow_hold_call_during_emergency_bool";
    public static final String KEY_ALLOW_HOLD_VIDEO_CALL_BOOL = "allow_hold_video_call_bool";
    public static final String KEY_ALLOW_LOCAL_DTMF_TONES_BOOL = "allow_local_dtmf_tones_bool";
    public static final String KEY_ALLOW_MERGE_WIFI_CALLS_WHEN_VOWIFI_OFF_BOOL = "allow_merge_wifi_calls_when_vowifi_off_bool";
    public static final String KEY_ALLOW_NON_EMERGENCY_CALLS_IN_ECM_BOOL = "allow_non_emergency_calls_in_ecm_bool";
    public static final String KEY_ALLOW_VIDEO_CALLING_FALLBACK_BOOL = "allow_video_calling_fallback_bool";
    public static final String KEY_ALWAYS_SHOW_DATA_RAT_ICON_BOOL = "always_show_data_rat_icon_bool";
    @Deprecated
    public static final String KEY_ALWAYS_SHOW_EMERGENCY_ALERT_ONOFF_BOOL = "always_show_emergency_alert_onoff_bool";
    public static final String KEY_ALWAYS_SHOW_PRIMARY_SIGNAL_BAR_IN_OPPORTUNISTIC_NETWORK_BOOLEAN = "always_show_primary_signal_bar_in_opportunistic_network_boolean";
    public static final String KEY_APN_EXPAND_BOOL = "apn_expand_bool";
    public static final String KEY_APN_SETTINGS_DEFAULT_APN_TYPES_STRING_ARRAY = "apn_settings_default_apn_types_string_array";
    public static final String KEY_AUTO_RETRY_ENABLED_BOOL = "auto_retry_enabled_bool";
    public static final String KEY_CALL_BARRING_DEFAULT_SERVICE_CLASS_INT = "call_barring_default_service_class_int";
    public static final String KEY_CALL_BARRING_SUPPORTS_DEACTIVATE_ALL_BOOL = "call_barring_supports_deactivate_all_bool";
    public static final String KEY_CALL_BARRING_SUPPORTS_PASSWORD_CHANGE_BOOL = "call_barring_supports_password_change_bool";
    public static final String KEY_CALL_BARRING_VISIBILITY_BOOL = "call_barring_visibility_bool";
    public static final String KEY_CALL_COMPOSER_PICTURE_SERVER_URL_STRING = "call_composer_picture_server_url_string";
    public static final String KEY_CALL_FORWARDING_BLOCKS_WHILE_ROAMING_STRING_ARRAY = "call_forwarding_blocks_while_roaming_string_array";
    public static final String KEY_CALL_REDIRECTION_SERVICE_COMPONENT_NAME_STRING = "call_redirection_service_component_name_string";
    public static final String KEY_CAPABILITIES_EXEMPT_FROM_SINGLE_DC_CHECK_INT_ARRAY = "capabilities_exempt_from_single_dc_check_int_array";
    public static final String KEY_CARRIER_ALLOW_DEFLECT_IMS_CALL_BOOL = "carrier_allow_deflect_ims_call_bool";
    public static final String KEY_CARRIER_ALLOW_TURNOFF_IMS_BOOL = "carrier_allow_turnoff_ims_bool";
    public static final String KEY_CARRIER_APP_REQUIRED_DURING_SIM_SETUP_BOOL = "carrier_app_required_during_setup_bool";
    public static final String KEY_CARRIER_CALL_SCREENING_APP_STRING = "call_screening_app";
    public static final String KEY_CARRIER_CERTIFICATE_STRING_ARRAY = "carrier_certificate_string_array";
    public static final String KEY_CARRIER_CONFIG_APPLIED_BOOL = "carrier_config_applied_bool";
    public static final String KEY_CARRIER_CONFIG_VERSION_STRING = "carrier_config_version_string";
    public static final String KEY_CARRIER_CROSS_SIM_IMS_AVAILABLE_BOOL = "carrier_cross_sim_ims_available_bool";
    @Deprecated
    public static final String KEY_CARRIER_DATA_CALL_PERMANENT_FAILURE_STRINGS = "carrier_data_call_permanent_failure_strings";
    public static final String KEY_CARRIER_DEFAULT_ACTIONS_ON_DCFAILURE_STRING_ARRAY = "carrier_default_actions_on_dcfailure_string_array";
    public static final String KEY_CARRIER_DEFAULT_ACTIONS_ON_DEFAULT_NETWORK_AVAILABLE = "carrier_default_actions_on_default_network_available_string_array";
    public static final String KEY_CARRIER_DEFAULT_ACTIONS_ON_REDIRECTION_STRING_ARRAY = "carrier_default_actions_on_redirection_string_array";
    public static final String KEY_CARRIER_DEFAULT_ACTIONS_ON_RESET = "carrier_default_actions_on_reset_string_array";
    public static final String KEY_CARRIER_DEFAULT_REDIRECTION_URL_STRING_ARRAY = "carrier_default_redirection_url_string_array";
    public static final String KEY_CARRIER_DEFAULT_WFC_IMS_ENABLED_BOOL = "carrier_default_wfc_ims_enabled_bool";
    public static final String KEY_CARRIER_DEFAULT_WFC_IMS_MODE_INT = "carrier_default_wfc_ims_mode_int";
    public static final String KEY_CARRIER_DEFAULT_WFC_IMS_ROAMING_MODE_INT = "carrier_default_wfc_ims_roaming_mode_int";
    @Deprecated
    public static final String KEY_CARRIER_FORCE_DISABLE_ETWS_CMAS_TEST_BOOL = "carrier_force_disable_etws_cmas_test_bool";
    public static final String KEY_CARRIER_IMS_GBA_REQUIRED_BOOL = "carrier_ims_gba_required_bool";
    public static final String KEY_CARRIER_INSTANT_LETTERING_AVAILABLE_BOOL = "carrier_instant_lettering_available_bool";
    public static final String KEY_CARRIER_INSTANT_LETTERING_ENCODING_STRING = "carrier_instant_lettering_encoding_string";
    public static final String KEY_CARRIER_INSTANT_LETTERING_ESCAPED_CHARS_STRING = "carrier_instant_lettering_escaped_chars_string";
    public static final String KEY_CARRIER_INSTANT_LETTERING_INVALID_CHARS_STRING = "carrier_instant_lettering_invalid_chars_string";
    public static final String KEY_CARRIER_INSTANT_LETTERING_LENGTH_LIMIT_INT = "carrier_instant_lettering_length_limit_int";
    public static final String KEY_CARRIER_METERED_APN_TYPES_STRINGS = "carrier_metered_apn_types_strings";
    public static final String KEY_CARRIER_METERED_ROAMING_APN_TYPES_STRINGS = "carrier_metered_roaming_apn_types_strings";
    public static final String KEY_CARRIER_NAME_OVERRIDE_BOOL = "carrier_name_override_bool";
    public static final String KEY_CARRIER_NAME_STRING = "carrier_name_string";
    public static final String KEY_CARRIER_NR_AVAILABILITIES_INT_ARRAY = "carrier_nr_availabilities_int_array";
    public static final String KEY_CARRIER_PROVISIONS_WIFI_MERGED_NETWORKS_BOOL = "carrier_provisions_wifi_merged_networks_bool";
    public static final String KEY_CARRIER_RCS_PROVISIONING_REQUIRED_BOOL = "carrier_rcs_provisioning_required_bool";
    public static final String KEY_CARRIER_SERVICE_NAME_STRING_ARRAY = "carrier_service_name_array";
    public static final String KEY_CARRIER_SERVICE_NUMBER_STRING_ARRAY = "carrier_service_number_array";
    public static final String KEY_CARRIER_SETTINGS_ACTIVITY_COMPONENT_NAME_STRING = "carrier_settings_activity_component_name_string";
    public static final String KEY_CARRIER_SETTINGS_ENABLE_BOOL = "carrier_settings_enable_bool";
    public static final String KEY_CARRIER_SUPPORTED_SATELLITE_SERVICES_PER_PROVIDER_BUNDLE = "carrier_supported_satellite_services_per_provider_bundle";
    public static final String KEY_CARRIER_SUPPORTS_OPP_DATA_AUTO_PROVISIONING_BOOL = "carrier_supports_opp_data_auto_provisioning_bool";
    public static final String KEY_CARRIER_SUPPORTS_SS_OVER_UT_BOOL = "carrier_supports_ss_over_ut_bool";
    public static final String KEY_CARRIER_SUPPORTS_TETHERING_BOOL = "carrier_supports_tethering_bool";
    public static final String KEY_CARRIER_USE_IMS_FIRST_FOR_EMERGENCY_BOOL = "carrier_use_ims_first_for_emergency_bool";
    public static final String KEY_CARRIER_USSD_METHOD_INT = "carrier_ussd_method_int";
    @Deprecated
    public static final String KEY_CARRIER_UT_PROVISIONING_REQUIRED_BOOL = "carrier_ut_provisioning_required_bool";
    public static final String KEY_CARRIER_VOLTE_AVAILABLE_BOOL = "carrier_volte_available_bool";
    public static final String KEY_CARRIER_VOLTE_OVERRIDE_WFC_PROVISIONING_BOOL = "carrier_volte_override_wfc_provisioning_bool";
    @Deprecated
    public static final String KEY_CARRIER_VOLTE_PROVISIONED_BOOL = "carrier_volte_provisioned_bool";
    @Deprecated
    public static final String KEY_CARRIER_VOLTE_PROVISIONING_REQUIRED_BOOL = "carrier_volte_provisioning_required_bool";
    public static final String KEY_CARRIER_VOLTE_TTY_SUPPORTED_BOOL = "carrier_volte_tty_supported_bool";
    public static final String KEY_CARRIER_VT_AVAILABLE_BOOL = "carrier_vt_available_bool";
    @Deprecated
    public static final String KEY_CARRIER_VVM_PACKAGE_NAME_STRING = "carrier_vvm_package_name_string";
    public static final String KEY_CARRIER_VVM_PACKAGE_NAME_STRING_ARRAY = "carrier_vvm_package_name_string_array";
    public static final String KEY_CARRIER_WFC_IMS_AVAILABLE_BOOL = "carrier_wfc_ims_available_bool";
    public static final String KEY_CARRIER_WFC_SUPPORTS_WIFI_ONLY_BOOL = "carrier_wfc_supports_wifi_only_bool";
    public static final String KEY_CDMA_3WAYCALL_FLASH_DELAY_INT = "cdma_3waycall_flash_delay_int";
    public static final String KEY_CDMA_DTMF_TONE_DELAY_INT = "cdma_dtmf_tone_delay_int";
    public static final String KEY_CDMA_NONROAMING_NETWORKS_STRING_ARRAY = "cdma_nonroaming_networks_string_array";
    public static final String KEY_CDMA_ROAMING_MODE_INT = "cdma_roaming_mode_int";
    public static final String KEY_CDMA_ROAMING_NETWORKS_STRING_ARRAY = "cdma_roaming_networks_string_array";
    public static final String KEY_CELLULAR_SERVICE_CAPABILITIES_INT_ARRAY = "cellular_service_capabilities_int_array";
    public static final String KEY_CELLULAR_USAGE_SETTING_INT = "cellular_usage_setting_int";
    public static final String KEY_CHECK_PRICING_WITH_CARRIER_FOR_DATA_ROAMING_BOOL = "check_pricing_with_carrier_data_roaming_bool";
    public static final String KEY_CI_ACTION_ON_SYS_UPDATE_BOOL = "ci_action_on_sys_update_bool";
    public static final String KEY_CI_ACTION_ON_SYS_UPDATE_EXTRA_STRING = "ci_action_on_sys_update_extra_string";
    public static final String KEY_CI_ACTION_ON_SYS_UPDATE_EXTRA_VAL_STRING = "ci_action_on_sys_update_extra_val_string";
    public static final String KEY_CI_ACTION_ON_SYS_UPDATE_INTENT_STRING = "ci_action_on_sys_update_intent_string";
    public static final String KEY_CONFIG_IMS_MMTEL_PACKAGE_OVERRIDE_STRING = "config_ims_mmtel_package_override_string";
    @Deprecated
    public static final String KEY_CONFIG_IMS_PACKAGE_OVERRIDE_STRING = "config_ims_package_override_string";
    public static final String KEY_CONFIG_IMS_RCS_PACKAGE_OVERRIDE_STRING = "config_ims_rcs_package_override_string";
    public static final String KEY_CONFIG_PLANS_PACKAGE_OVERRIDE_STRING = "config_plans_package_override_string";
    public static final String KEY_CONFIG_TELEPHONY_USE_OWN_NUMBER_FOR_VOICEMAIL_BOOL = "config_telephony_use_own_number_for_voicemail_bool";
    public static final String KEY_CONFIG_WIFI_DISABLE_IN_ECBM = "config_wifi_disable_in_ecbm";
    public static final String KEY_CROSS_SIM_SPN_FORMAT_INT = "cross_sim_spn_format_int";
    public static final String KEY_CSP_ENABLED_BOOL = "csp_enabled_bool";
    public static final String KEY_DATA_LIMIT_NOTIFICATION_BOOL = "data_limit_notification_bool";
    public static final String KEY_DATA_LIMIT_THRESHOLD_BYTES_LONG = "data_limit_threshold_bytes_long";
    public static final String KEY_DATA_RAPID_NOTIFICATION_BOOL = "data_rapid_notification_bool";
    public static final String KEY_DATA_SWITCH_VALIDATION_MIN_INTERVAL_MILLIS_LONG = "data_switch_validation_min_gap_long";
    public static final String KEY_DATA_SWITCH_VALIDATION_TIMEOUT_LONG = "data_switch_validation_timeout_long";
    public static final String KEY_DATA_WARNING_NOTIFICATION_BOOL = "data_warning_notification_bool";
    public static final String KEY_DATA_WARNING_THRESHOLD_BYTES_LONG = "data_warning_threshold_bytes_long";
    public static final String KEY_DEFAULT_SIM_CALL_MANAGER_STRING = "default_sim_call_manager_string";
    public static final String KEY_DEFAULT_VM_NUMBER_ROAMING_AND_IMS_UNREGISTERED_STRING = "default_vm_number_roaming_and_ims_unregistered_string";
    public static final String KEY_DEFAULT_VM_NUMBER_STRING = "default_vm_number_string";
    public static final String KEY_DIAL_STRING_REPLACE_STRING_ARRAY = "dial_string_replace_string_array";
    public static final String KEY_DISABLE_CDMA_ACTIVATION_CODE_BOOL = "disable_cdma_activation_code_bool";
    public static final String KEY_DISABLE_CHARGE_INDICATION_BOOL = "disable_charge_indication_bool";
    public static final String KEY_DISABLE_SUPPLEMENTARY_SERVICES_IN_AIRPLANE_MODE_BOOL = "disable_supplementary_services_in_airplane_mode_bool";
    public static final String KEY_DISCONNECT_CAUSE_PLAY_BUSYTONE_INT_ARRAY = "disconnect_cause_play_busytone_int_array";
    public static final String KEY_DISPLAY_CALL_STRENGTH_INDICATOR_BOOL = "display_call_strength_indicator_bool";
    public static final String KEY_DISPLAY_HD_AUDIO_PROPERTY_BOOL = "display_hd_audio_property_bool";
    public static final String KEY_DROP_VIDEO_CALL_WHEN_ANSWERING_AUDIO_CALL_BOOL = "drop_video_call_when_answering_audio_call_bool";
    public static final String KEY_DTMF_TYPE_ENABLED_BOOL = "dtmf_type_enabled_bool";
    public static final String KEY_DURATION_BLOCKING_DISABLED_AFTER_EMERGENCY_INT = "duration_blocking_disabled_after_emergency_int";
    public static final String KEY_EDITABLE_ENHANCED_4G_LTE_BOOL = "editable_enhanced_4g_lte_bool";
    public static final String KEY_EDITABLE_VOICEMAIL_NUMBER_BOOL = "editable_voicemail_number_bool";
    public static final String KEY_EDITABLE_VOICEMAIL_NUMBER_SETTING_BOOL = "editable_voicemail_number_setting_bool";
    public static final String KEY_EDITABLE_WFC_MODE_BOOL = "editable_wfc_mode_bool";
    public static final String KEY_EDITABLE_WFC_ROAMING_MODE_BOOL = "editable_wfc_roaming_mode_bool";
    public static final String KEY_EMERGENCY_NOTIFICATION_DELAY_INT = "emergency_notification_delay_int";
    public static final String KEY_EMERGENCY_NUMBER_PREFIX_STRING_ARRAY = "emergency_number_prefix_string_array";
    public static final String KEY_ENABLE_CROSS_SIM_CALLING_ON_OPPORTUNISTIC_DATA_BOOL = "enable_cross_sim_calling_on_opportunistic_data_bool";
    public static final String KEY_ENABLE_DIALER_KEY_VIBRATION_BOOL = "enable_dialer_key_vibration_bool";
    public static final String KEY_ENHANCED_4G_LTE_ON_BY_DEFAULT_BOOL = "enhanced_4g_lte_on_by_default_bool";
    public static final String KEY_ENHANCED_4G_LTE_TITLE_VARIANT_INT = "enhanced_4g_lte_title_variant_int";
    public static final String KEY_ESIM_DOWNLOAD_RETRY_BACKOFF_TIMER_SEC_INT = "esim_download_retry_backoff_timer_sec_int";
    public static final String KEY_ESIM_MAX_DOWNLOAD_RETRY_ATTEMPTS_INT = "esim_max_download_retry_attempts_int";
    public static final String KEY_FORCE_HOME_NETWORK_BOOL = "force_home_network_bool";
    public static final String KEY_GSM_DTMF_TONE_DELAY_INT = "gsm_dtmf_tone_delay_int";
    public static final String KEY_GSM_NONROAMING_NETWORKS_STRING_ARRAY = "gsm_nonroaming_networks_string_array";
    public static final String KEY_GSM_ROAMING_NETWORKS_STRING_ARRAY = "gsm_roaming_networks_string_array";
    public static final String KEY_HAS_IN_CALL_NOISE_SUPPRESSION_BOOL = "has_in_call_noise_suppression_bool";
    public static final String KEY_HIDE_CARRIER_NETWORK_SETTINGS_BOOL = "hide_carrier_network_settings_bool";
    public static final String KEY_HIDE_ENHANCED_4G_LTE_BOOL = "hide_enhanced_4g_lte_bool";
    public static final String KEY_HIDE_IMS_APN_BOOL = "hide_ims_apn_bool";
    public static final String KEY_HIDE_LTE_PLUS_DATA_ICON_BOOL = "hide_lte_plus_data_icon_bool";
    public static final String KEY_HIDE_PREFERRED_NETWORK_TYPE_BOOL = "hide_preferred_network_type_bool";
    public static final String KEY_HIDE_PRESET_APN_DETAILS_BOOL = "hide_preset_apn_details_bool";
    public static final String KEY_HIDE_SIM_LOCK_SETTINGS_BOOL = "hide_sim_lock_settings_bool";
    public static final String KEY_HIDE_TTY_HCO_VCO_WITH_RTT_BOOL = "hide_tty_hco_vco_with_rtt";
    public static final String KEY_IGNORE_DATA_ENABLED_CHANGED_FOR_VIDEO_CALLS = "ignore_data_enabled_changed_for_video_calls";
    public static final String KEY_IGNORE_RTT_MODE_SETTING_BOOL = "ignore_rtt_mode_setting_bool";
    public static final String KEY_IGNORE_SIM_NETWORK_LOCKED_EVENTS_BOOL = "ignore_sim_network_locked_events_bool";
    public static final String KEY_IMS_CONFERENCE_SIZE_LIMIT_INT = "ims_conference_size_limit_int";
    public static final String KEY_IMS_DTMF_TONE_DELAY_INT = "ims_dtmf_tone_delay_int";
    public static final String KEY_INCLUDE_LTE_FOR_NR_ADVANCED_THRESHOLD_BANDWIDTH_BOOL = "include_lte_for_nr_advanced_threshold_bandwidth_bool";
    public static final String KEY_IS_IMS_CONFERENCE_SIZE_ENFORCED_BOOL = "is_ims_conference_size_enforced_bool";
    public static final String KEY_IS_OPPORTUNISTIC_SUBSCRIPTION_BOOL = "is_opportunistic_subscription_bool";
    public static final String KEY_LTE_ENABLED_BOOL = "lte_enabled_bool";
    public static final String KEY_LTE_RSRQ_THRESHOLDS_INT_ARRAY = "lte_rsrq_thresholds_int_array";
    public static final String KEY_LTE_RSSNR_THRESHOLDS_INT_ARRAY = "lte_rssnr_thresholds_int_array";
    public static final String KEY_MDN_IS_ADDITIONAL_VOICEMAIL_NUMBER_BOOL = "mdn_is_additional_voicemail_number_bool";
    public static final String KEY_MMS_ALIAS_ENABLED_BOOL = "aliasEnabled";
    public static final String KEY_MMS_ALIAS_MAX_CHARS_INT = "aliasMaxChars";
    public static final String KEY_MMS_ALIAS_MIN_CHARS_INT = "aliasMinChars";
    public static final String KEY_MMS_ALLOW_ATTACH_AUDIO_BOOL = "allowAttachAudio";
    public static final String KEY_MMS_APPEND_TRANSACTION_ID_BOOL = "enabledTransID";
    public static final String KEY_MMS_CLOSE_CONNECTION_BOOL = "mmsCloseConnection";
    public static final String KEY_MMS_EMAIL_GATEWAY_NUMBER_STRING = "emailGatewayNumber";
    public static final String KEY_MMS_GROUP_MMS_ENABLED_BOOL = "enableGroupMms";
    public static final String KEY_MMS_HTTP_PARAMS_STRING = "httpParams";
    public static final String KEY_MMS_HTTP_SOCKET_TIMEOUT_INT = "httpSocketTimeout";
    public static final String KEY_MMS_MAX_IMAGE_HEIGHT_INT = "maxImageHeight";
    public static final String KEY_MMS_MAX_IMAGE_WIDTH_INT = "maxImageWidth";
    public static final String KEY_MMS_MAX_MESSAGE_SIZE_INT = "maxMessageSize";
    public static final String KEY_MMS_MESSAGE_TEXT_MAX_SIZE_INT = "maxMessageTextSize";
    public static final String KEY_MMS_MMS_DELIVERY_REPORT_ENABLED_BOOL = "enableMMSDeliveryReports";
    public static final String KEY_MMS_MMS_ENABLED_BOOL = "enabledMMS";
    public static final String KEY_MMS_MMS_READ_REPORT_ENABLED_BOOL = "enableMMSReadReports";
    public static final String KEY_MMS_MULTIPART_SMS_ENABLED_BOOL = "enableMultipartSMS";
    public static final String KEY_MMS_NAI_SUFFIX_STRING = "naiSuffix";
    public static final String KEY_MMS_NETWORK_RELEASE_TIMEOUT_MILLIS_INT = "mms_network_release_timeout_millis_int";
    public static final String KEY_MMS_NOTIFY_WAP_MMSC_ENABLED_BOOL = "enabledNotifyWapMMSC";
    public static final String KEY_MMS_RECIPIENT_LIMIT_INT = "recipientLimit";
    public static final String KEY_MMS_SEND_MULTIPART_SMS_AS_SEPARATE_MESSAGES_BOOL = "sendMultipartSmsAsSeparateMessages";
    public static final String KEY_MMS_SHOW_CELL_BROADCAST_APP_LINKS_BOOL = "config_cellBroadcastAppLinks";
    public static final String KEY_MMS_SMS_DELIVERY_REPORT_ENABLED_BOOL = "enableSMSDeliveryReports";
    public static final String KEY_MMS_SMS_TO_MMS_TEXT_LENGTH_THRESHOLD_INT = "smsToMmsTextLengthThreshold";
    public static final String KEY_MMS_SMS_TO_MMS_TEXT_THRESHOLD_INT = "smsToMmsTextThreshold";
    public static final String KEY_MMS_SUBJECT_MAX_LENGTH_INT = "maxSubjectLength";
    public static final String KEY_MMS_SUPPORT_HTTP_CHARSET_HEADER_BOOL = "supportHttpCharsetHeader";
    public static final String KEY_MMS_SUPPORT_MMS_CONTENT_DISPOSITION_BOOL = "supportMmsContentDisposition";
    public static final String KEY_MMS_UA_PROF_TAG_NAME_STRING = "uaProfTagName";
    public static final String KEY_MMS_UA_PROF_URL_STRING = "uaProfUrl";
    public static final String KEY_MMS_USER_AGENT_STRING = "userAgent";
    public static final String KEY_MONTHLY_DATA_CYCLE_DAY_INT = "monthly_data_cycle_day_int";
    public static final String KEY_NTN_LTE_RSRP_THRESHOLDS_INT_ARRAY = "ntn_lte_rsrp_thresholds_int_array";
    public static final String KEY_NTN_LTE_RSRQ_THRESHOLDS_INT_ARRAY = "ntn_lte_rsrq_thresholds_int_array";
    public static final String KEY_NTN_LTE_RSSNR_THRESHOLDS_INT_ARRAY = "ntn_lte_rssnr_thresholds_int_array";
    public static final String KEY_ONLY_AUTO_SELECT_IN_HOME_NETWORK_BOOL = "only_auto_select_in_home_network";
    public static final String KEY_ONLY_SINGLE_DC_ALLOWED_INT_ARRAY = "only_single_dc_allowed_int_array";
    public static final String KEY_OPERATOR_SELECTION_EXPAND_BOOL = "operator_selection_expand_bool";
    public static final String KEY_OPPORTUNISTIC_NETWORK_BACKOFF_TIME_LONG = "opportunistic_network_backoff_time_long";
    public static final String KEY_OPPORTUNISTIC_NETWORK_DATA_SWITCH_EXIT_HYSTERESIS_TIME_LONG = "opportunistic_network_data_switch_exit_hysteresis_time_long";
    public static final String KEY_OPPORTUNISTIC_NETWORK_DATA_SWITCH_HYSTERESIS_TIME_LONG = "opportunistic_network_data_switch_hysteresis_time_long";
    public static final String KEY_OPPORTUNISTIC_NETWORK_ENTRY_OR_EXIT_HYSTERESIS_TIME_LONG = "opportunistic_network_entry_or_exit_hysteresis_time_long";
    public static final String KEY_OPPORTUNISTIC_NETWORK_ENTRY_THRESHOLD_BANDWIDTH_INT = "opportunistic_network_entry_threshold_bandwidth_int";
    public static final String KEY_OPPORTUNISTIC_NETWORK_ENTRY_THRESHOLD_RSRP_INT = "opportunistic_network_entry_threshold_rsrp_int";
    public static final String KEY_OPPORTUNISTIC_NETWORK_ENTRY_THRESHOLD_RSSNR_INT = "opportunistic_network_entry_threshold_rssnr_int";
    public static final String KEY_OPPORTUNISTIC_NETWORK_EXIT_THRESHOLD_RSRP_INT = "opportunistic_network_exit_threshold_rsrp_int";
    public static final String KEY_OPPORTUNISTIC_NETWORK_EXIT_THRESHOLD_RSSNR_INT = "opportunistic_network_exit_threshold_rssnr_int";
    public static final String KEY_OPPORTUNISTIC_NETWORK_MAX_BACKOFF_TIME_LONG = "opportunistic_network_max_backoff_time_long";
    public static final String KEY_OPPORTUNISTIC_NETWORK_PING_PONG_TIME_LONG = "opportunistic_network_ping_pong_time_long";
    public static final String KEY_PARAMETERS_USED_FOR_NTN_LTE_SIGNAL_BAR_INT = "parameters_used_for_ntn_lte_signal_bar_int";
    public static final String KEY_PING_TEST_BEFORE_DATA_SWITCH_BOOL = "ping_test_before_data_switch_bool";
    public static final String KEY_PREFER_2G_BOOL = "prefer_2g_bool";
    public static final String KEY_PREFER_3G_VISIBILITY_BOOL = "prefer_3g_visibility_bool";
    public static final String KEY_PREMIUM_CAPABILITY_MAXIMUM_DAILY_NOTIFICATION_COUNT_INT = "premium_capability_maximum_daily_notification_count_int";
    public static final String KEY_PREMIUM_CAPABILITY_MAXIMUM_MONTHLY_NOTIFICATION_COUNT_INT = "premium_capability_maximum_monthly_notification_count_int";
    public static final String KEY_PREMIUM_CAPABILITY_NETWORK_SETUP_TIME_MILLIS_LONG = "premium_capability_network_setup_time_millis_long";
    public static final String KEY_PREMIUM_CAPABILITY_NOTIFICATION_BACKOFF_HYSTERESIS_TIME_MILLIS_LONG = "premium_capability_notification_backoff_hysteresis_time_millis_long";
    public static final String KEY_PREMIUM_CAPABILITY_NOTIFICATION_DISPLAY_TIMEOUT_MILLIS_LONG = "premium_capability_notification_display_timeout_millis_long";
    public static final String KEY_PREMIUM_CAPABILITY_PURCHASE_CONDITION_BACKOFF_HYSTERESIS_TIME_MILLIS_LONG = "premium_capability_purchase_condition_backoff_hysteresis_time_millis_long";
    public static final String KEY_PREMIUM_CAPABILITY_PURCHASE_URL_STRING = "premium_capability_purchase_url_string";
    public static final String KEY_PREMIUM_CAPABILITY_SUPPORTED_ON_LTE_BOOL = "premium_capability_supported_on_lte_bool";
    public static final String KEY_PREVENT_CLIR_ACTIVATION_AND_DEACTIVATION_CODE_BOOL = "prevent_clir_activation_and_deactivation_code_bool";
    public static final String KEY_RADIO_RESTART_FAILURE_CAUSES_INT_ARRAY = "radio_restart_failure_causes_int_array";
    public static final String KEY_RATCHET_NR_ADVANCED_BANDWIDTH_IF_RRC_IDLE_BOOL = "ratchet_nr_advanced_bandwidth_if_rrc_idle_bool";
    public static final String KEY_RCS_CONFIG_SERVER_URL_STRING = "rcs_config_server_url_string";
    public static final String KEY_READ_ONLY_APN_FIELDS_STRING_ARRAY = "read_only_apn_fields_string_array";
    public static final String KEY_READ_ONLY_APN_TYPES_STRING_ARRAY = "read_only_apn_types_string_array";
    public static final String KEY_REQUIRE_ENTITLEMENT_CHECKS_BOOL = "require_entitlement_checks_bool";
    @Deprecated
    public static final String KEY_RESTART_RADIO_ON_PDP_FAIL_REGULAR_DEACTIVATION_BOOL = "restart_radio_on_pdp_fail_regular_deactivation_bool";
    public static final String KEY_RTT_AUTO_UPGRADE_BOOL = "rtt_auto_upgrade_bool";
    public static final String KEY_RTT_DOWNGRADE_SUPPORTED_BOOL = "rtt_downgrade_supported_bool";
    public static final String KEY_RTT_SUPPORTED_BOOL = "rtt_supported_bool";
    public static final String KEY_RTT_SUPPORTED_FOR_VT_BOOL = "rtt_supported_for_vt_bool";
    public static final String KEY_RTT_SUPPORTED_WHILE_ROAMING_BOOL = "rtt_supported_while_roaming_bool";
    public static final String KEY_RTT_UPGRADE_SUPPORTED_BOOL = "rtt_upgrade_supported_bool";
    public static final String KEY_RTT_UPGRADE_SUPPORTED_FOR_DOWNGRADED_VT_CALL_BOOL = "rtt_upgrade_supported_for_downgraded_vt_call";
    public static final String KEY_SATELLITE_ATTACH_SUPPORTED_BOOL = "satellite_attach_supported_bool";
    public static final String KEY_SATELLITE_CONNECTION_HYSTERESIS_SEC_INT = "satellite_connection_hysteresis_sec_int";
    public static final String KEY_SATELLITE_ENTITLEMENT_STATUS_REFRESH_DAYS_INT = "satellite_entitlement_status_refresh_days_int";
    public static final String KEY_SATELLITE_ENTITLEMENT_SUPPORTED_BOOL = "satellite_entitlement_supported_bool";
    public static final String KEY_SHOW_4G_FOR_3G_DATA_ICON_BOOL = "show_4g_for_3g_data_icon_bool";
    public static final String KEY_SHOW_4G_FOR_LTE_DATA_ICON_BOOL = "show_4g_for_lte_data_icon_bool";
    public static final String KEY_SHOW_APN_SETTING_CDMA_BOOL = "show_apn_setting_cdma_bool";
    public static final String KEY_SHOW_BLOCKING_PAY_PHONE_OPTION_BOOL = "show_blocking_pay_phone_option_bool";
    public static final String KEY_SHOW_CALL_BLOCKING_DISABLED_NOTIFICATION_ALWAYS_BOOL = "show_call_blocking_disabled_notification_always_bool";
    public static final String KEY_SHOW_CDMA_CHOICES_BOOL = "show_cdma_choices_bool";
    public static final String KEY_SHOW_FORWARDED_NUMBER_BOOL = "show_forwarded_number_bool";
    public static final String KEY_SHOW_ICCID_IN_SIM_STATUS_BOOL = "show_iccid_in_sim_status_bool";
    public static final String KEY_SHOW_IMS_REGISTRATION_STATUS_BOOL = "show_ims_registration_status_bool";
    public static final String KEY_SHOW_ONSCREEN_DIAL_BUTTON_BOOL = "show_onscreen_dial_button_bool";
    public static final String KEY_SHOW_ROAMING_INDICATOR_BOOL = "show_roaming_indicator_bool";
    public static final String KEY_SHOW_SIGNAL_STRENGTH_IN_SIM_STATUS_BOOL = "show_signal_strength_in_sim_status_bool";
    public static final String KEY_SHOW_VIDEO_CALL_CHARGES_ALERT_DIALOG_BOOL = "show_video_call_charges_alert_dialog_bool";
    public static final String KEY_SHOW_WFC_LOCATION_PRIVACY_POLICY_BOOL = "show_wfc_location_privacy_policy_bool";
    @Deprecated
    public static final String KEY_SIMPLIFIED_NETWORK_SETTINGS_BOOL = "simplified_network_settings_bool";
    public static final String KEY_SIM_COUNTRY_ISO_OVERRIDE_STRING = "sim_country_iso_override_string";
    public static final String KEY_SIM_NETWORK_UNLOCK_ALLOW_DISMISS_BOOL = "sim_network_unlock_allow_dismiss_bool";
    public static final String KEY_SMDP_SERVER_ADDRESS_STRING = "smdp_server_address_string";
    public static final String KEY_SMS_REQUIRES_DESTINATION_NUMBER_CONVERSION_BOOL = "sms_requires_destination_number_conversion_bool";
    public static final String KEY_SUBSCRIPTION_GROUP_UUID_STRING = "subscription_group_uuid_string";
    public static final String KEY_SUPPORTED_PREMIUM_CAPABILITIES_INT_ARRAY = "supported_premium_capabilities_int_array";
    public static final String KEY_SUPPORTS_BUSINESS_CALL_COMPOSER_BOOL = "supports_business_call_composer_bool";
    public static final String KEY_SUPPORTS_CALL_COMPOSER_BOOL = "supports_call_composer_bool";
    public static final String KEY_SUPPORTS_DEVICE_TO_DEVICE_COMMUNICATION_USING_DTMF_BOOL = "supports_device_to_device_communication_using_dtmf_bool";
    public static final String KEY_SUPPORTS_DEVICE_TO_DEVICE_COMMUNICATION_USING_RTP_BOOL = "supports_device_to_device_communication_using_rtp_bool";
    public static final String KEY_SUPPORTS_SDP_NEGOTIATION_OF_D2D_RTP_HEADER_EXTENSIONS_BOOL = "supports_sdp_negotiation_of_d2d_rtp_header_extensions_bool";
    public static final String KEY_SUPPORT_3GPP_CALL_FORWARDING_WHILE_ROAMING_BOOL = "support_3gpp_call_forwarding_while_roaming_bool";
    public static final String KEY_SUPPORT_ADD_CONFERENCE_PARTICIPANTS_BOOL = "support_add_conference_participants_bool";
    public static final String KEY_SUPPORT_ADHOC_CONFERENCE_CALLS_BOOL = "support_adhoc_conference_calls_bool";
    public static final String KEY_SUPPORT_CLIR_NETWORK_DEFAULT_BOOL = "support_clir_network_default_bool";
    public static final String KEY_SUPPORT_CONFERENCE_CALL_BOOL = "support_conference_call_bool";
    public static final String KEY_SUPPORT_EMERGENCY_SMS_OVER_IMS_BOOL = "support_emergency_sms_over_ims_bool";
    public static final String KEY_SUPPORT_ENHANCED_CALL_BLOCKING_BOOL = "support_enhanced_call_blocking_bool";
    public static final String KEY_SUPPORT_IMS_CONFERENCE_EVENT_PACKAGE_BOOL = "support_ims_conference_event_package_bool";
    public static final String KEY_SUPPORT_PAUSE_IMS_VIDEO_CALLS_BOOL = "support_pause_ims_video_calls_bool";
    public static final String KEY_SUPPORT_SWAP_AFTER_MERGE_BOOL = "support_swap_after_merge_bool";
    public static final String KEY_SUPPORT_TDSCDMA_BOOL = "support_tdscdma_bool";
    public static final String KEY_SUPPORT_TDSCDMA_ROAMING_NETWORKS_STRING_ARRAY = "support_tdscdma_roaming_networks_string_array";
    public static final String KEY_SWITCH_DATA_TO_PRIMARY_IF_PRIMARY_IS_OOS_BOOL = "switch_data_to_primary_if_primary_is_oos_bool";
    public static final String KEY_TREAT_DOWNGRADED_VIDEO_CALLS_AS_VIDEO_CALLS_BOOL = "treat_downgraded_video_calls_as_video_calls_bool";
    public static final String KEY_TTY_SUPPORTED_BOOL = "tty_supported_bool";
    public static final String KEY_UNLOGGABLE_NUMBERS_STRING_ARRAY = "unloggable_numbers_string_array";
    public static final String KEY_USE_ACS_FOR_RCS_BOOL = "use_acs_for_rcs_bool";
    public static final String KEY_USE_HFA_FOR_PROVISIONING_BOOL = "use_hfa_for_provisioning_bool";
    public static final String KEY_USE_IP_FOR_CALLING_INDICATOR_BOOL = "use_ip_for_calling_indicator_bool";
    public static final String KEY_USE_OTASP_FOR_PROVISIONING_BOOL = "use_otasp_for_provisioning_bool";
    @Deprecated
    public static final String KEY_USE_RCS_PRESENCE_BOOL = "use_rcs_presence_bool";
    public static final String KEY_USE_RCS_SIP_OPTIONS_BOOL = "use_rcs_sip_options_bool";
    public static final String KEY_USE_WFC_HOME_NETWORK_MODE_IN_ROAMING_NETWORK_BOOL = "use_wfc_home_network_mode_in_roaming_network_bool";
    public static final String KEY_VOICEMAIL_NOTIFICATION_PERSISTENT_BOOL = "voicemail_notification_persistent_bool";
    public static final String KEY_VOICE_PRIVACY_DISABLE_UI_BOOL = "voice_privacy_disable_ui_bool";
    public static final String KEY_VOLTE_REPLACEMENT_RAT_INT = "volte_replacement_rat_int";
    public static final String KEY_VONR_ENABLED_BOOL = "vonr_enabled_bool";
    public static final String KEY_VONR_ON_BY_DEFAULT_BOOL = "vonr_on_by_default_bool";
    public static final String KEY_VONR_SETTING_VISIBILITY_BOOL = "vonr_setting_visibility_bool";
    public static final String KEY_VT_UPGRADE_SUPPORTED_FOR_DOWNGRADED_RTT_CALL_BOOL = "vt_upgrade_supported_for_downgraded_rtt_call";
    public static final String KEY_VVM_CELLULAR_DATA_REQUIRED_BOOL = "vvm_cellular_data_required_bool";
    public static final String KEY_VVM_CLIENT_PREFIX_STRING = "vvm_client_prefix_string";
    public static final String KEY_VVM_DESTINATION_NUMBER_STRING = "vvm_destination_number_string";
    public static final String KEY_VVM_DISABLED_CAPABILITIES_STRING_ARRAY = "vvm_disabled_capabilities_string_array";
    public static final String KEY_VVM_LEGACY_MODE_ENABLED_BOOL = "vvm_legacy_mode_enabled_bool";
    public static final String KEY_VVM_PORT_NUMBER_INT = "vvm_port_number_int";
    public static final String KEY_VVM_PREFETCH_BOOL = "vvm_prefetch_bool";
    public static final String KEY_VVM_SSL_ENABLED_BOOL = "vvm_ssl_enabled_bool";
    public static final String KEY_VVM_TYPE_STRING = "vvm_type_string";
    public static final String KEY_WFC_EMERGENCY_ADDRESS_CARRIER_APP_STRING = "wfc_emergency_address_carrier_app_string";
    public static final String KEY_WORLD_MODE_ENABLED_BOOL = "world_mode_enabled_bool";
    public static final String KEY_WORLD_PHONE_BOOL = "world_phone_bool";
    public static final String REMOVE_GROUP_UUID_STRING = "00000000-0000-0000-0000-000000000000";
    public static final int SERVICE_CLASS_NONE = 0;
    public static final int SERVICE_CLASS_VOICE = 1;
    public static final int USSD_OVER_CS_ONLY = 2;
    public static final int USSD_OVER_CS_PREFERRED = 0;
    public static final int USSD_OVER_IMS_ONLY = 3;
    public static final int USSD_OVER_IMS_PREFERRED = 1;
    
    CarrierConfigManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public PersistableBundle getConfigForSubId(final int subId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PersistableBundle getConfigForSubId(final int subId, @NonNull final String... keys) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public PersistableBundle getConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PersistableBundle getConfig(@NonNull final String... keys) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isConfigForIdentifiedCarrier(final PersistableBundle bundle) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyConfigChangedForSubId(final int subId) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PersistableBundle getConfigByComponentForSubId(@NonNull final String prefix, final int subId) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerCarrierConfigChangeListener(@NonNull final Executor executor, @NonNull final CarrierConfigChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterCarrierConfigChangeListener(@NonNull final CarrierConfigChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Apn
    {
        @Deprecated
        public static final String KEY_PREFIX = "apn.";
        public static final String KEY_SETTINGS_DEFAULT_PROTOCOL_STRING = "apn.settings_default_protocol_string";
        public static final String KEY_SETTINGS_DEFAULT_ROAMING_PROTOCOL_STRING = "apn.settings_default_roaming_protocol_string";
        public static final String PROTOCOL_IPV4 = "IP";
        public static final String PROTOCOL_IPV4V6 = "IPV4V6";
        public static final String PROTOCOL_IPV6 = "IPV6";
        
        Apn() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Bsf
    {
        public static final String KEY_BSF_SERVER_FQDN_STRING = "bsf.bsf_server_fqdn_string";
        public static final String KEY_BSF_SERVER_PORT_INT = "bsf.bsf_server_port_int";
        public static final String KEY_BSF_TRANSPORT_TYPE_INT = "bsf.bsf_transport_type_int";
        public static final String KEY_PREFIX = "bsf.";
        
        Bsf() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Gps
    {
        public static final String KEY_PERSIST_LPP_MODE_BOOL = "gps.persist_lpp_mode_bool";
        public static final String KEY_PREFIX = "gps.";
        
        Gps() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Ims
    {
        public static final int E911_RTCP_INACTIVITY_ON_CONNECTED = 3;
        public static final int E911_RTP_INACTIVITY_ON_CONNECTED = 4;
        public static final int GEOLOCATION_PIDF_FOR_EMERGENCY_ON_CELLULAR = 4;
        public static final int GEOLOCATION_PIDF_FOR_EMERGENCY_ON_WIFI = 2;
        public static final int GEOLOCATION_PIDF_FOR_NON_EMERGENCY_ON_CELLULAR = 3;
        public static final int GEOLOCATION_PIDF_FOR_NON_EMERGENCY_ON_WIFI = 1;
        public static final int IPSEC_AUTHENTICATION_ALGORITHM_HMAC_MD5 = 0;
        public static final int IPSEC_AUTHENTICATION_ALGORITHM_HMAC_SHA1 = 1;
        public static final int IPSEC_ENCRYPTION_ALGORITHM_AES_CBC = 2;
        public static final int IPSEC_ENCRYPTION_ALGORITHM_DES_EDE3_CBC = 1;
        public static final int IPSEC_ENCRYPTION_ALGORITHM_NULL = 0;
        public static final String KEY_CAPABILITY_TYPE_CALL_COMPOSER_INT_ARRAY = "ims.capability_type_call_composer_int_array";
        public static final String KEY_CAPABILITY_TYPE_OPTIONS_UCE_INT_ARRAY = "ims.capability_type_options_uce_int_array";
        public static final String KEY_CAPABILITY_TYPE_PRESENCE_UCE_INT_ARRAY = "ims.capability_type_presence_uce_int_array";
        public static final String KEY_CAPABILITY_TYPE_SMS_INT_ARRAY = "ims.capability_type_sms_int_array";
        public static final String KEY_CAPABILITY_TYPE_UT_INT_ARRAY = "ims.capability_type_ut_int_array";
        public static final String KEY_CAPABILITY_TYPE_VIDEO_INT_ARRAY = "ims.capability_type_video_int_array";
        public static final String KEY_CAPABILITY_TYPE_VOICE_INT_ARRAY = "ims.capability_type_voice_int_array";
        public static final String KEY_ENABLE_PRESENCE_CAPABILITY_EXCHANGE_BOOL = "ims.enable_presence_capability_exchange_bool";
        public static final String KEY_ENABLE_PRESENCE_GROUP_SUBSCRIBE_BOOL = "ims.enable_presence_group_subscribe_bool";
        public static final String KEY_ENABLE_PRESENCE_PUBLISH_BOOL = "ims.enable_presence_publish_bool";
        public static final String KEY_GEOLOCATION_PIDF_IN_SIP_INVITE_SUPPORT_INT_ARRAY = "ims.geolocation_pidf_in_sip_invite_support_int_array";
        public static final String KEY_GEOLOCATION_PIDF_IN_SIP_REGISTER_SUPPORT_INT_ARRAY = "ims.geolocation_pidf_in_sip_register_support_int_array";
        public static final String KEY_GRUU_ENABLED_BOOL = "ims.gruu_enabled_bool";
        public static final String KEY_IMS_PDN_ENABLED_IN_NO_VOPS_SUPPORT_INT_ARRAY = "ims.ims_pdn_enabled_in_no_vops_support_int_array";
        public static final String KEY_IMS_SINGLE_REGISTRATION_REQUIRED_BOOL = "ims.ims_single_registration_required_bool";
        public static final String KEY_IMS_USER_AGENT_STRING = "ims.ims_user_agent_string";
        public static final String KEY_IPSEC_AUTHENTICATION_ALGORITHMS_INT_ARRAY = "ims.ipsec_authentication_algorithms_int_array";
        public static final String KEY_IPSEC_ENCRYPTION_ALGORITHMS_INT_ARRAY = "ims.ipsec_encryption_algorithms_int_array";
        public static final String KEY_IPV4_SIP_MTU_SIZE_CELLULAR_INT = "ims.ipv4_sip_mtu_size_cellular_int";
        public static final String KEY_IPV6_SIP_MTU_SIZE_CELLULAR_INT = "ims.ipv6_sip_mtu_size_cellular_int";
        public static final String KEY_KEEP_PDN_UP_IN_NO_VOPS_BOOL = "ims.keep_pdn_up_in_no_vops_bool";
        public static final String KEY_MMTEL_REQUIRES_PROVISIONING_BUNDLE = "ims.mmtel_requires_provisioning_bundle";
        public static final String KEY_NON_RCS_CAPABILITIES_CACHE_EXPIRATION_SEC_INT = "ims.non_rcs_capabilities_cache_expiration_sec_int";
        public static final String KEY_PHONE_CONTEXT_DOMAIN_NAME_STRING = "ims.phone_context_domain_name_string";
        public static final String KEY_PREFIX = "ims.";
        public static final String KEY_RCS_BULK_CAPABILITY_EXCHANGE_BOOL = "ims.rcs_bulk_capability_exchange_bool";
        public static final String KEY_RCS_FEATURE_TAG_ALLOWED_STRING_ARRAY = "ims.rcs_feature_tag_allowed_string_array";
        public static final String KEY_RCS_REQUIRES_PROVISIONING_BUNDLE = "ims.rcs_requires_provisioning_bundle";
        public static final String KEY_REGISTRATION_EVENT_PACKAGE_SUPPORTED_BOOL = "ims.registration_event_package_supported_bool";
        public static final String KEY_REGISTRATION_EXPIRY_TIMER_SEC_INT = "ims.registration_expiry_timer_sec_int";
        public static final String KEY_REGISTRATION_RETRY_BASE_TIMER_MILLIS_INT = "ims.registration_retry_base_timer_millis_int";
        public static final String KEY_REGISTRATION_RETRY_MAX_TIMER_MILLIS_INT = "ims.registration_retry_max_timer_millis_int";
        public static final String KEY_REGISTRATION_SUBSCRIBE_EXPIRY_TIMER_SEC_INT = "ims.registration_subscribe_expiry_timer_sec_int";
        public static final String KEY_REQUEST_URI_TYPE_INT = "ims.request_uri_type_int";
        public static final String KEY_SIP_OVER_IPSEC_ENABLED_BOOL = "ims.sip_over_ipsec_enabled_bool";
        public static final String KEY_SIP_PREFERRED_TRANSPORT_INT = "ims.sip_preferred_transport_int";
        public static final String KEY_SIP_SERVER_PORT_NUMBER_INT = "ims.sip_server_port_number_int";
        public static final String KEY_SIP_TIMER_B_MILLIS_INT = "ims.sip_timer_b_millis_int";
        public static final String KEY_SIP_TIMER_C_MILLIS_INT = "ims.sip_timer_c_millis_int";
        public static final String KEY_SIP_TIMER_D_MILLIS_INT = "ims.sip_timer_d_millis_int";
        public static final String KEY_SIP_TIMER_F_MILLIS_INT = "ims.sip_timer_f_millis_int";
        public static final String KEY_SIP_TIMER_H_MILLIS_INT = "ims.sip_timer_h_millis_int";
        public static final String KEY_SIP_TIMER_J_MILLIS_INT = "ims.sip_timer_j_millis_int";
        public static final String KEY_SIP_TIMER_T1_MILLIS_INT = "ims.sip_timer_t1_millis_int";
        public static final String KEY_SIP_TIMER_T2_MILLIS_INT = "ims.sip_timer_t2_millis_int";
        public static final String KEY_SIP_TIMER_T4_MILLIS_INT = "ims.sip_timer_t4_millis_int";
        public static final String KEY_SUPPORTED_RATS_INT_ARRAY = "ims.supported_rats_int_array";
        public static final String KEY_USE_SIP_URI_FOR_PRESENCE_SUBSCRIBE_BOOL = "ims.use_sip_uri_for_presence_subscribe_bool";
        public static final String KEY_WIFI_OFF_DEFERRING_TIME_MILLIS_INT = "ims.wifi_off_deferring_time_millis_int";
        public static final int NETWORK_TYPE_HOME = 0;
        public static final int NETWORK_TYPE_ROAMING = 1;
        public static final int PREFERRED_TRANSPORT_DYNAMIC_UDP_TCP = 2;
        public static final int PREFERRED_TRANSPORT_TCP = 1;
        public static final int PREFERRED_TRANSPORT_TLS = 3;
        public static final int PREFERRED_TRANSPORT_UDP = 0;
        public static final int REQUEST_URI_FORMAT_SIP = 1;
        public static final int REQUEST_URI_FORMAT_TEL = 0;
        public static final int RTCP_INACTIVITY_ON_CONNECTED = 1;
        public static final int RTCP_INACTIVITY_ON_HOLD = 0;
        public static final int RTP_INACTIVITY_ON_CONNECTED = 2;
        
        Ims() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ImsEmergency
    {
        public static final int DOMAIN_CS = 1;
        public static final int DOMAIN_PS_3GPP = 2;
        public static final int DOMAIN_PS_NON_3GPP = 3;
        public static final String KEY_CROSS_STACK_REDIAL_TIMER_SEC_INT = "imsemergency.cross_stack_redial_timer_sec_int";
        public static final String KEY_EMERGENCY_CALLBACK_MODE_SUPPORTED_BOOL = "imsemergency.emergency_callback_mode_supported_bool";
        public static final String KEY_EMERGENCY_CALL_SETUP_TIMER_ON_CURRENT_NETWORK_SEC_INT = "imsemergency.emergency_call_setup_timer_on_current_network_sec_int";
        public static final String KEY_EMERGENCY_CDMA_PREFERRED_NUMBERS_STRING_ARRAY = "imsemergency.emergency_cdma_preferred_numbers_string_array";
        public static final String KEY_EMERGENCY_DOMAIN_PREFERENCE_INT_ARRAY = "imsemergency.emergency_domain_preference_int_array";
        public static final String KEY_EMERGENCY_DOMAIN_PREFERENCE_ROAMING_INT_ARRAY = "imsemergency.emergency_domain_preference_roaming_int_array";
        public static final String KEY_EMERGENCY_LTE_PREFERRED_AFTER_NR_FAILED_BOOL = "imsemergency.emergency_lte_preferred_after_nr_failed_bool";
        public static final String KEY_EMERGENCY_NETWORK_SCAN_TYPE_INT = "imsemergency.emergency_network_scan_type_int";
        public static final String KEY_EMERGENCY_OVER_CS_ROAMING_SUPPORTED_ACCESS_NETWORK_TYPES_INT_ARRAY = "imsemergency.emergency_over_cs_roaming_supported_access_network_types_int_array";
        public static final String KEY_EMERGENCY_OVER_CS_SUPPORTED_ACCESS_NETWORK_TYPES_INT_ARRAY = "imsemergency.emergency_over_cs_supported_access_network_types_int_array";
        public static final String KEY_EMERGENCY_OVER_IMS_ROAMING_SUPPORTED_3GPP_NETWORK_TYPES_INT_ARRAY = "imsemergency.emergency_over_ims_roaming_supported_3gpp_network_types_int_array";
        public static final String KEY_EMERGENCY_OVER_IMS_SUPPORTED_3GPP_NETWORK_TYPES_INT_ARRAY = "imsemergency.emergency_over_ims_supported_3gpp_network_types_int_array";
        public static final String KEY_EMERGENCY_OVER_IMS_SUPPORTED_RATS_INT_ARRAY = "imsemergency.emergency_over_ims_supported_rats_int_array";
        public static final String KEY_EMERGENCY_QOS_PRECONDITION_SUPPORTED_BOOL = "imsemergency.emergency_qos_precondition_supported_bool";
        public static final String KEY_EMERGENCY_REGISTRATION_TIMER_MILLIS_INT = "imsemergency.emergency_registration_timer_millis_int";
        public static final String KEY_EMERGENCY_REQUIRES_IMS_REGISTRATION_BOOL = "imsemergency.emergency_requires_ims_registration_bool";
        public static final String KEY_EMERGENCY_REQUIRES_VOLTE_ENABLED_BOOL = "imsemergency.emergency_requires_volte_enabled_bool";
        public static final String KEY_EMERGENCY_SCAN_TIMER_SEC_INT = "imsemergency.emergency_scan_timer_sec_int";
        public static final String KEY_EMERGENCY_VOWIFI_REQUIRES_CONDITION_INT = "imsemergency.emergency_vowifi_requires_condition_int";
        public static final String KEY_MAXIMUM_CELLULAR_SEARCH_TIMER_SEC_INT = "imsemergency.maximum_cellular_search_timer_sec_int";
        public static final String KEY_MAXIMUM_NUMBER_OF_EMERGENCY_TRIES_OVER_VOWIFI_INT = "imsemergency.maximum_number_of_emergency_tries_over_vowifi_int";
        public static final String KEY_PREFER_IMS_EMERGENCY_WHEN_VOICE_CALLS_ON_CS_BOOL = "imsemergency.prefer_ims_emergency_when_voice_calls_on_cs_bool";
        public static final String KEY_PREFIX = "imsemergency.";
        public static final String KEY_QUICK_CROSS_STACK_REDIAL_TIMER_SEC_INT = "imsemergency.quick_cross_stack_redial_timer_sec_int";
        public static final String KEY_REFRESH_GEOLOCATION_TIMEOUT_MILLIS_INT = "imsemergency.refresh_geolocation_timeout_millis_int";
        public static final String KEY_RETRY_EMERGENCY_ON_IMS_PDN_BOOL = "imsemergency.retry_emergency_on_ims_pdn_bool";
        public static final String KEY_SCAN_LIMITED_SERVICE_AFTER_VOLTE_FAILURE_BOOL = "imsemergency.scan_limited_service_after_volte_failure_bool";
        public static final String KEY_START_QUICK_CROSS_STACK_REDIAL_TIMER_WHEN_REGISTERED_BOOL = "imsemergency.start_quick_cross_stack_redial_timer_when_registered_bool";
        public static final int REDIAL_TIMER_DISABLED = 0;
        public static final int SCAN_TYPE_FULL_SERVICE = 1;
        public static final int SCAN_TYPE_FULL_SERVICE_FOLLOWED_BY_LIMITED_SERVICE = 2;
        public static final int SCAN_TYPE_NO_PREFERENCE = 0;
        public static final int VOWIFI_REQUIRES_NONE = 0;
        public static final int VOWIFI_REQUIRES_SETTING_ENABLED = 1;
        public static final int VOWIFI_REQUIRES_VALID_EID = 2;
        
        ImsEmergency() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ImsRtt
    {
        public static final String KEY_PREFIX = "imsrtt.";
        public static final String KEY_RED_PAYLOAD_TYPE_INT = "imsrtt.red_payload_type_int";
        public static final String KEY_T140_PAYLOAD_TYPE_INT = "imsrtt.t140_payload_type_int";
        public static final String KEY_TEXT_AS_BANDWIDTH_KBPS_INT = "imsrtt.text_as_bandwidth_kbps_int";
        public static final String KEY_TEXT_CODEC_CAPABILITY_PAYLOAD_TYPES_BUNDLE = "imsrtt.text_codec_capability_payload_types_bundle";
        public static final String KEY_TEXT_ON_DEFAULT_BEARER_SUPPORTED_BOOL = "imsrtt.text_on_default_bearer_supported_bool";
        public static final String KEY_TEXT_QOS_PRECONDITION_SUPPORTED_BOOL = "imsrtt.text_qos_precondition_supported_bool";
        public static final String KEY_TEXT_RR_BANDWIDTH_BPS_INT = "imsrtt.text_rr_bandwidth_bps_int";
        public static final String KEY_TEXT_RS_BANDWIDTH_BPS_INT = "imsrtt.text_rs_bandwidth_bps_int";
        
        ImsRtt() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ImsServiceEntitlement
    {
        public static final String KEY_ENTITLEMENT_SERVER_URL_STRING = "imsserviceentitlement.entitlement_server_url_string";
        public static final String KEY_FCM_SENDER_ID_STRING = "imsserviceentitlement.fcm_sender_id_string";
        public static final String KEY_IMS_PROVISIONING_BOOL = "imsserviceentitlement.ims_provisioning_bool";
        public static final String KEY_PREFIX = "imsserviceentitlement.";
        public static final String KEY_SHOW_VOWIFI_WEBVIEW_BOOL = "imsserviceentitlement.show_vowifi_webview_bool";
        
        ImsServiceEntitlement() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ImsSms
    {
        public static final String KEY_PREFIX = "imssms.";
        public static final String KEY_SMS_CSFB_RETRY_ON_FAILURE_BOOL = "imssms.sms_csfb_retry_on_failure_bool";
        public static final String KEY_SMS_MAX_RETRY_COUNT_INT = "imssms.sms_max_retry_count_int";
        public static final String KEY_SMS_MAX_RETRY_OVER_IMS_COUNT_INT = "imssms.sms_max_retry_over_ims_count_int";
        public static final String KEY_SMS_OVER_IMS_FORMAT_INT = "imssms.sms_over_ims_format_int";
        public static final String KEY_SMS_OVER_IMS_SEND_RETRY_DELAY_MILLIS_INT = "imssms.sms_over_ims_send_retry_delay_millis_int";
        public static final String KEY_SMS_OVER_IMS_SUPPORTED_BOOL = "imssms.sms_over_ims_supported_bool";
        public static final String KEY_SMS_OVER_IMS_SUPPORTED_RATS_INT_ARRAY = "imssms.sms_over_ims_supported_rats_int_array";
        public static final String KEY_SMS_RP_CAUSE_VALUES_TO_FALLBACK_INT_ARRAY = "imssms.sms_rp_cause_values_to_fallback_int_array";
        public static final String KEY_SMS_RP_CAUSE_VALUES_TO_RETRY_OVER_IMS_INT_ARRAY = "imssms.sms_rp_cause_values_to_retry_over_ims_int_array";
        public static final String KEY_SMS_TR1_TIMER_MILLIS_INT = "imssms.sms_tr1_timer_millis_int";
        public static final String KEY_SMS_TR2_TIMER_MILLIS_INT = "imssms.sms_tr2_timer_millis_int";
        public static final int SMS_FORMAT_3GPP = 0;
        public static final int SMS_FORMAT_3GPP2 = 1;
        
        ImsSms() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ImsSs
    {
        public static final int CALL_WAITING_SYNC_FIRST_CHANGE = 3;
        public static final int CALL_WAITING_SYNC_FIRST_POWER_UP = 2;
        public static final int CALL_WAITING_SYNC_IMS_ONLY = 4;
        public static final int CALL_WAITING_SYNC_NONE = 0;
        public static final int CALL_WAITING_SYNC_USER_CHANGE = 1;
        public static final String KEY_NETWORK_INITIATED_USSD_OVER_IMS_SUPPORTED_BOOL = "imsss.network_initiated_ussd_over_ims_supported_bool";
        public static final String KEY_PREFIX = "imsss.";
        public static final String KEY_TERMINAL_BASED_CALL_WAITING_DEFAULT_ENABLED_BOOL = "imsss.terminal_based_call_waiting_default_enabled_bool";
        public static final String KEY_TERMINAL_BASED_CALL_WAITING_SYNC_TYPE_INT = "imsss.terminal_based_call_waiting_sync_type_int";
        public static final String KEY_USE_CSFB_ON_XCAP_OVER_UT_FAILURE_BOOL = "imsss.use_csfb_on_xcap_over_ut_failure_bool";
        public static final String KEY_UT_AS_SERVER_FQDN_STRING = "imsss.ut_as_server_fqdn_string";
        public static final String KEY_UT_AS_SERVER_PORT_INT = "imsss.ut_as_server_port_int";
        public static final String KEY_UT_IPTYPE_HOME_INT = "imsss.ut_iptype_home_int";
        public static final String KEY_UT_IPTYPE_ROAMING_INT = "imsss.ut_iptype_roaming_int";
        public static final String KEY_UT_REQUIRES_IMS_REGISTRATION_BOOL = "imsss.ut_requires_ims_registration_bool";
        public static final String KEY_UT_SERVER_BASED_SERVICES_INT_ARRAY = "imsss.ut_server_based_services_int_array";
        public static final String KEY_UT_SUPPORTED_WHEN_PS_DATA_OFF_BOOL = "imsss.ut_supported_when_ps_data_off_bool";
        public static final String KEY_UT_SUPPORTED_WHEN_ROAMING_BOOL = "imsss.ut_supported_when_roaming_bool";
        public static final String KEY_UT_TERMINAL_BASED_SERVICES_INT_ARRAY = "imsss.ut_terminal_based_services_int_array";
        public static final String KEY_UT_TRANSPORT_TYPE_INT = "imsss.ut_transport_type_int";
        public static final String KEY_XCAP_OVER_UT_SUPPORTED_RATS_INT_ARRAY = "imsss.xcap_over_ut_supported_rats_int_array";
        public static final int SUPPLEMENTARY_SERVICE_CB_ACR = 20;
        public static final int SUPPLEMENTARY_SERVICE_CB_ALL = 12;
        public static final int SUPPLEMENTARY_SERVICE_CB_BAIC = 18;
        public static final int SUPPLEMENTARY_SERVICE_CB_BAOC = 14;
        public static final int SUPPLEMENTARY_SERVICE_CB_BIC_ROAM = 19;
        public static final int SUPPLEMENTARY_SERVICE_CB_BIL = 21;
        public static final int SUPPLEMENTARY_SERVICE_CB_BOIC = 15;
        public static final int SUPPLEMENTARY_SERVICE_CB_BOIC_EXHC = 16;
        public static final int SUPPLEMENTARY_SERVICE_CB_IBS = 17;
        public static final int SUPPLEMENTARY_SERVICE_CB_OBS = 13;
        public static final int SUPPLEMENTARY_SERVICE_CF_ALL = 1;
        public static final int SUPPLEMENTARY_SERVICE_CF_ALL_CONDITONAL_FORWARDING = 3;
        public static final int SUPPLEMENTARY_SERVICE_CF_CFB = 4;
        public static final int SUPPLEMENTARY_SERVICE_CF_CFNL = 7;
        public static final int SUPPLEMENTARY_SERVICE_CF_CFNRC = 6;
        public static final int SUPPLEMENTARY_SERVICE_CF_CFNRY = 5;
        public static final int SUPPLEMENTARY_SERVICE_CF_CFU = 2;
        public static final int SUPPLEMENTARY_SERVICE_CW = 0;
        public static final int SUPPLEMENTARY_SERVICE_IDENTIFICATION_OIP = 8;
        public static final int SUPPLEMENTARY_SERVICE_IDENTIFICATION_OIR = 10;
        public static final int SUPPLEMENTARY_SERVICE_IDENTIFICATION_TIP = 9;
        public static final int SUPPLEMENTARY_SERVICE_IDENTIFICATION_TIR = 11;
        
        ImsSs() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ImsVoice
    {
        public static final int ALERTING_SRVCC_SUPPORT = 1;
        public static final int BANDWIDTH_EFFICIENT = 0;
        public static final int BASIC_SRVCC_SUPPORT = 0;
        public static final int CONFERENCE_SUBSCRIBE_TYPE_IN_DIALOG = 0;
        public static final int CONFERENCE_SUBSCRIBE_TYPE_OUT_OF_DIALOG = 1;
        public static final int EVS_ENCODED_BW_TYPE_FB = 3;
        public static final int EVS_ENCODED_BW_TYPE_NB = 0;
        public static final int EVS_ENCODED_BW_TYPE_NB_WB = 4;
        public static final int EVS_ENCODED_BW_TYPE_NB_WB_SWB = 5;
        public static final int EVS_ENCODED_BW_TYPE_NB_WB_SWB_FB = 6;
        public static final int EVS_ENCODED_BW_TYPE_SWB = 2;
        public static final int EVS_ENCODED_BW_TYPE_WB = 1;
        public static final int EVS_ENCODED_BW_TYPE_WB_SWB = 7;
        public static final int EVS_ENCODED_BW_TYPE_WB_SWB_FB = 8;
        public static final int EVS_OPERATIONAL_MODE_AMRWB_IO = 1;
        public static final int EVS_OPERATIONAL_MODE_PRIMARY = 0;
        public static final int EVS_PRIMARY_MODE_BITRATE_128_0_KBPS = 11;
        public static final int EVS_PRIMARY_MODE_BITRATE_13_2_KBPS = 4;
        public static final int EVS_PRIMARY_MODE_BITRATE_16_4_KBPS = 5;
        public static final int EVS_PRIMARY_MODE_BITRATE_24_4_KBPS = 6;
        public static final int EVS_PRIMARY_MODE_BITRATE_32_0_KBPS = 7;
        public static final int EVS_PRIMARY_MODE_BITRATE_48_0_KBPS = 8;
        public static final int EVS_PRIMARY_MODE_BITRATE_5_9_KBPS = 0;
        public static final int EVS_PRIMARY_MODE_BITRATE_64_0_KBPS = 9;
        public static final int EVS_PRIMARY_MODE_BITRATE_7_2_KBPS = 1;
        public static final int EVS_PRIMARY_MODE_BITRATE_8_0_KBPS = 2;
        public static final int EVS_PRIMARY_MODE_BITRATE_96_0_KBPS = 10;
        public static final int EVS_PRIMARY_MODE_BITRATE_9_6_KBPS = 3;
        public static final String KEY_AMRNB_PAYLOAD_DESCRIPTION_BUNDLE = "imsvoice.amrnb_payload_description_bundle";
        public static final String KEY_AMRNB_PAYLOAD_TYPE_INT_ARRAY = "imsvoice.amrnb_payload_type_int_array";
        public static final String KEY_AMRWB_PAYLOAD_DESCRIPTION_BUNDLE = "imsvoice.amrwb_payload_description_bundle";
        public static final String KEY_AMRWB_PAYLOAD_TYPE_INT_ARRAY = "imsvoice.amrwb_payload_type_int_array";
        public static final String KEY_AMR_CODEC_ATTRIBUTE_MODESET_INT_ARRAY = "imsvoice.amr_codec_attribute_modeset_int_array";
        public static final String KEY_AMR_CODEC_ATTRIBUTE_PAYLOAD_FORMAT_INT = "imsvoice.amr_codec_attribute_payload_format_int";
        public static final String KEY_AUDIO_AS_BANDWIDTH_KBPS_INT = "imsvoice.audio_as_bandwidth_kbps_int";
        public static final String KEY_AUDIO_CODEC_CAPABILITY_PAYLOAD_TYPES_BUNDLE = "imsvoice.audio_codec_capability_payload_types_bundle";
        public static final String KEY_AUDIO_INACTIVITY_CALL_END_REASONS_INT_ARRAY = "imsvoice.audio_inactivity_call_end_reasons_int_array";
        public static final String KEY_AUDIO_RR_BANDWIDTH_BPS_INT = "imsvoice.audio_rr_bandwidth_bps_int";
        public static final String KEY_AUDIO_RS_BANDWIDTH_BPS_INT = "imsvoice.audio_rs_bandwidth_bps_int";
        public static final String KEY_AUDIO_RTCP_INACTIVITY_TIMER_MILLIS_INT = "imsvoice.audio_rtcp_inactivity_timer_millis_int";
        public static final String KEY_AUDIO_RTP_INACTIVITY_TIMER_MILLIS_INT = "imsvoice.audio_rtp_inactivity_timer_millis_int";
        public static final String KEY_CARRIER_VOLTE_ROAMING_AVAILABLE_BOOL = "imsvoice.carrier_volte_roaming_available_bool";
        public static final String KEY_CODEC_ATTRIBUTE_MODE_CHANGE_CAPABILITY_INT = "imsvoice.codec_attribute_mode_change_capability_int";
        public static final String KEY_CODEC_ATTRIBUTE_MODE_CHANGE_NEIGHBOR_INT = "imsvoice.codec_attribute_mode_change_neighbor_int";
        public static final String KEY_CODEC_ATTRIBUTE_MODE_CHANGE_PERIOD_INT = "imsvoice.codec_attribute_mode_change_period_int";
        public static final String KEY_CONFERENCE_FACTORY_URI_STRING = "imsvoice.conference_factory_uri_string";
        public static final String KEY_CONFERENCE_SUBSCRIBE_TYPE_INT = "imsvoice.conference_subscribe_type_int";
        public static final String KEY_DEDICATED_BEARER_WAIT_TIMER_MILLIS_INT = "imsvoice.dedicated_bearer_wait_timer_millis_int";
        public static final String KEY_DTMFNB_PAYLOAD_TYPE_INT_ARRAY = "imsvoice.dtmfnb_payload_type_int_array";
        public static final String KEY_DTMFWB_PAYLOAD_TYPE_INT_ARRAY = "imsvoice.dtmfwb_payload_type_int_array";
        public static final String KEY_EVS_CODEC_ATTRIBUTE_BANDWIDTH_INT = "imsvoice.evs_codec_attribute_bandwidth_int";
        public static final String KEY_EVS_CODEC_ATTRIBUTE_BITRATE_INT_ARRAY = "imsvoice.evs_codec_attribute_bitrate_int_array";
        public static final String KEY_EVS_CODEC_ATTRIBUTE_CHANNELS_INT = "imsvoice.evs_codec_attribute_channels_int";
        public static final String KEY_EVS_CODEC_ATTRIBUTE_CH_AW_RECV_INT = "imsvoice.evs_codec_attribute_ch_aw_recv_int";
        public static final String KEY_EVS_CODEC_ATTRIBUTE_CMR_INT = "imsvoice.codec_attribute_cmr_int";
        public static final String KEY_EVS_CODEC_ATTRIBUTE_DTX_BOOL = "imsvoice.evs_codec_attribute_dtx_bool";
        public static final String KEY_EVS_CODEC_ATTRIBUTE_DTX_RECV_BOOL = "imsvoice.evs_codec_attribute_dtx_recv_bool";
        public static final String KEY_EVS_CODEC_ATTRIBUTE_HF_ONLY_INT = "imsvoice.evs_codec_attribute_hf_only_int";
        public static final String KEY_EVS_CODEC_ATTRIBUTE_MODE_SWITCH_INT = "imsvoice.evs_codec_attribute_mode_switch_int";
        public static final String KEY_EVS_PAYLOAD_DESCRIPTION_BUNDLE = "imsvoice.evs_payload_description_bundle";
        public static final String KEY_EVS_PAYLOAD_TYPE_INT_ARRAY = "imsvoice.evs_payload_type_int_array";
        public static final String KEY_INCLUDE_CALLER_ID_SERVICE_CODES_IN_SIP_INVITE_BOOL = "imsvoice.include_caller_id_service_codes_in_sip_invite_bool";
        public static final String KEY_MINIMUM_SESSION_EXPIRES_TIMER_SEC_INT = "imsvoice.minimum_session_expires_timer_sec_int";
        public static final String KEY_MO_CALL_REQUEST_TIMEOUT_MILLIS_INT = "imsvoice.mo_call_request_timeout_millis_int";
        public static final String KEY_MULTIENDPOINT_SUPPORTED_BOOL = "imsvoice.multiendpoint_supported_bool";
        public static final String KEY_OIP_SOURCE_FROM_HEADER_BOOL = "imsvoice.oip_source_from_header_bool";
        public static final String KEY_PRACK_SUPPORTED_FOR_18X_BOOL = "imsvoice.prack_supported_for_18x_bool";
        public static final String KEY_PREFIX = "imsvoice.";
        public static final String KEY_RINGBACK_TIMER_MILLIS_INT = "imsvoice.ringback_timer_millis_int";
        public static final String KEY_RINGING_TIMER_MILLIS_INT = "imsvoice.ringing_timer_millis_int";
        public static final String KEY_SESSION_EXPIRES_TIMER_SEC_INT = "imsvoice.session_expires_timer_sec_int";
        public static final String KEY_SESSION_PRIVACY_TYPE_INT = "imsvoice.session_privacy_type_int";
        public static final String KEY_SESSION_REFRESHER_TYPE_INT = "imsvoice.session_refresher_type_int";
        public static final String KEY_SESSION_REFRESH_METHOD_INT = "imsvoice.session_refresh_method_int";
        public static final String KEY_SESSION_TIMER_SUPPORTED_BOOL = "imsvoice.session_timer_supported_bool";
        public static final String KEY_SRVCC_TYPE_INT_ARRAY = "imsvoice.srvcc_type_int_array";
        public static final String KEY_VOICE_ON_DEFAULT_BEARER_SUPPORTED_BOOL = "imsvoice.voice_on_default_bearer_supported_bool";
        public static final String KEY_VOICE_QOS_PRECONDITION_SUPPORTED_BOOL = "imsvoice.voice_qos_precondition_supported_bool";
        public static final int MIDCALL_SRVCC_SUPPORT = 3;
        public static final int OCTET_ALIGNED = 1;
        public static final int PREALERTING_SRVCC_SUPPORT = 2;
        public static final int SESSION_PRIVACY_TYPE_HEADER = 0;
        public static final int SESSION_PRIVACY_TYPE_ID = 2;
        public static final int SESSION_PRIVACY_TYPE_NONE = 1;
        public static final int SESSION_REFRESHER_TYPE_UAC = 1;
        public static final int SESSION_REFRESHER_TYPE_UAS = 2;
        public static final int SESSION_REFRESHER_TYPE_UNKNOWN = 0;
        public static final int SESSION_REFRESH_METHOD_INVITE = 0;
        public static final int SESSION_REFRESH_METHOD_UPDATE_PREFERRED = 1;
        
        ImsVoice() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ImsVt
    {
        public static final String KEY_H264_PAYLOAD_DESCRIPTION_BUNDLE = "imsvt.h264_payload_description_bundle";
        public static final String KEY_H264_PAYLOAD_TYPE_INT_ARRAY = "imsvt.h264_payload_type_int_array";
        public static final String KEY_H264_VIDEO_CODEC_ATTRIBUTE_PROFILE_LEVEL_ID_STRING = "imsvt.h264_video_codec_attribute_profile_level_id_string";
        public static final String KEY_PREFIX = "imsvt.";
        public static final String KEY_VIDEO_AS_BANDWIDTH_KBPS_INT = "imsvt.video_as_bandwidth_kbps_int";
        public static final String KEY_VIDEO_CODEC_ATTRIBUTE_FRAME_RATE_INT = "imsvt.video_codec_attribute_frame_rate_int";
        public static final String KEY_VIDEO_CODEC_ATTRIBUTE_PACKETIZATION_MODE_INT = "imsvt.video_codec_attribute_packetization_mode_int";
        public static final String KEY_VIDEO_CODEC_ATTRIBUTE_RESOLUTION_INT_ARRAY = "imsvt.video_codec_attribute_resolution_int_array";
        public static final String KEY_VIDEO_CODEC_CAPABILITY_PAYLOAD_TYPES_BUNDLE = "imsvt.video_codec_capability_payload_types_bundle";
        public static final String KEY_VIDEO_ON_DEFAULT_BEARER_SUPPORTED_BOOL = "imsvt.video_on_default_bearer_supported_bool";
        public static final String KEY_VIDEO_QOS_PRECONDITION_SUPPORTED_BOOL = "imsvt.video_qos_precondition_supported_bool";
        public static final String KEY_VIDEO_RR_BANDWIDTH_BPS_INT = "imsvt.video_rr_bandwidth_bps_int";
        public static final String KEY_VIDEO_RS_BANDWIDTH_BPS_INT = "imsvt.video_rs_bandwidth_bps_int";
        public static final String KEY_VIDEO_RTCP_INACTIVITY_TIMER_MILLIS_INT = "imsvt.video_rtcp_inactivity_timer_millis_int";
        public static final String KEY_VIDEO_RTP_DSCP_INT = "imsvt.video_rtp_dscp_int";
        public static final String KEY_VIDEO_RTP_INACTIVITY_TIMER_MILLIS_INT = "imsvt.video_rtp_inactivity_timer_millis_int";
        
        ImsVt() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ImsWfc
    {
        public static final String KEY_EMERGENCY_CALL_OVER_EMERGENCY_PDN_BOOL = "imswfc.emergency_call_over_emergency_pdn_bool";
        public static final String KEY_PIDF_SHORT_CODE_STRING_ARRAY = "imswfc.pidf_short_code_string_array";
        public static final String KEY_PREFIX = "imswfc.";
        
        ImsWfc() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Iwlan
    {
        public static final int AUTHENTICATION_METHOD_CERT = 1;
        public static final int AUTHENTICATION_METHOD_EAP_ONLY = 0;
        public static final int EPDG_ADDRESS_CELLULAR_LOC = 3;
        public static final int EPDG_ADDRESS_IPV4_ONLY = 2;
        public static final int EPDG_ADDRESS_IPV4_PREFERRED = 0;
        public static final int EPDG_ADDRESS_IPV6_PREFERRED = 1;
        public static final int EPDG_ADDRESS_PCO = 2;
        public static final int EPDG_ADDRESS_PLMN = 1;
        public static final int EPDG_ADDRESS_STATIC = 0;
        public static final int EPDG_ADDRESS_VISITED_COUNTRY = 4;
        public static final int ID_TYPE_FQDN = 2;
        public static final int ID_TYPE_KEY_ID = 11;
        public static final int ID_TYPE_RFC822_ADDR = 3;
        public static final String KEY_ADD_KE_TO_CHILD_SESSION_REKEY_BOOL = "iwlan.add_ke_to_child_session_rekey_bool";
        public static final String KEY_CHILD_SA_REKEY_HARD_TIMER_SEC_INT = "iwlan.child_sa_rekey_hard_timer_sec_int";
        public static final String KEY_CHILD_SA_REKEY_SOFT_TIMER_SEC_INT = "iwlan.child_sa_rekey_soft_timer_sec_int";
        public static final String KEY_CHILD_SESSION_AES_CBC_KEY_SIZE_INT_ARRAY = "iwlan.child_session_aes_cbc_key_size_int_array";
        public static final String KEY_CHILD_SESSION_AES_CTR_KEY_SIZE_INT_ARRAY = "iwlan.child_session_aes_ctr_key_size_int_array";
        public static final String KEY_CHILD_SESSION_AES_GCM_KEY_SIZE_INT_ARRAY = "iwlan.child_session_aes_gcm_key_size_int_array";
        public static final String KEY_DIFFIE_HELLMAN_GROUPS_INT_ARRAY = "iwlan.diffie_hellman_groups_int_array";
        public static final String KEY_DPD_TIMER_SEC_INT = "iwlan.dpd_timer_sec_int";
        public static final String KEY_EPDG_ADDRESS_IP_TYPE_PREFERENCE_INT = "iwlan.epdg_address_ip_type_preference_int";
        public static final String KEY_EPDG_ADDRESS_PRIORITY_INT_ARRAY = "iwlan.epdg_address_priority_int_array";
        public static final String KEY_EPDG_AUTHENTICATION_METHOD_INT = "iwlan.epdg_authentication_method_int";
        public static final String KEY_EPDG_PCO_ID_IPV4_INT = "iwlan.epdg_pco_id_ipv4_int";
        public static final String KEY_EPDG_PCO_ID_IPV6_INT = "iwlan.epdg_pco_id_ipv6_int";
        public static final String KEY_EPDG_STATIC_ADDRESS_ROAMING_STRING = "iwlan.epdg_static_address_roaming_string";
        public static final String KEY_EPDG_STATIC_ADDRESS_STRING = "iwlan.epdg_static_address_string";
        public static final String KEY_IKE_LOCAL_ID_TYPE_INT = "iwlan.ike_local_id_type_int";
        public static final String KEY_IKE_REKEY_HARD_TIMER_SEC_INT = "iwlan.ike_rekey_hard_timer_in_sec";
        public static final String KEY_IKE_REKEY_SOFT_TIMER_SEC_INT = "iwlan.ike_rekey_soft_timer_sec_int";
        public static final String KEY_IKE_REMOTE_ID_TYPE_INT = "iwlan.ike_remote_id_type_int";
        public static final String KEY_IKE_SESSION_AES_CBC_KEY_SIZE_INT_ARRAY = "iwlan.ike_session_encryption_aes_cbc_key_size_int_array";
        public static final String KEY_IKE_SESSION_AES_CTR_KEY_SIZE_INT_ARRAY = "iwlan.ike_session_encryption_aes_ctr_key_size_int_array";
        public static final String KEY_IKE_SESSION_AES_GCM_KEY_SIZE_INT_ARRAY = "iwlan.ike_session_encryption_aes_gcm_key_size_int_array";
        public static final String KEY_MAX_RETRIES_INT = "iwlan.max_retries_int";
        public static final String KEY_MCC_MNCS_STRING_ARRAY = "iwlan.mcc_mncs_string_array";
        public static final String KEY_NATT_KEEP_ALIVE_TIMER_SEC_INT = "iwlan.natt_keep_alive_timer_sec_int";
        public static final String KEY_PREFIX = "iwlan.";
        public static final String KEY_RETRANSMIT_TIMER_MSEC_INT_ARRAY = "iwlan.retransmit_timer_sec_int_array";
        public static final String KEY_SUPPORTED_CHILD_SESSION_AEAD_ALGORITHMS_INT_ARRAY = "iwlan.supported_child_session_aead_algorithms_int_array";
        public static final String KEY_SUPPORTED_CHILD_SESSION_ENCRYPTION_ALGORITHMS_INT_ARRAY = "iwlan.supported_child_session_encryption_algorithms_int_array";
        public static final String KEY_SUPPORTED_IKE_SESSION_AEAD_ALGORITHMS_INT_ARRAY = "iwlan.supported_ike_session_aead_algorithms_int_array";
        public static final String KEY_SUPPORTED_IKE_SESSION_ENCRYPTION_ALGORITHMS_INT_ARRAY = "iwlan.supported_ike_session_encryption_algorithms_int_array";
        public static final String KEY_SUPPORTED_INTEGRITY_ALGORITHMS_INT_ARRAY = "iwlan.supported_integrity_algorithms_int_array";
        public static final String KEY_SUPPORTED_PRF_ALGORITHMS_INT_ARRAY = "iwlan.supported_prf_algorithms_int_array";
        public static final String KEY_SUPPORTS_CHILD_SESSION_MULTIPLE_SA_PROPOSALS_BOOL = "iwlan.supports_child_session_multiple_sa_proposals_bool";
        public static final String KEY_SUPPORTS_EAP_AKA_FAST_REAUTH_BOOL = "iwlan.supports_eap_aka_fast_reauth_bool";
        public static final String KEY_SUPPORTS_IKE_SESSION_MULTIPLE_SA_PROPOSALS_BOOL = "iwlan.supports_ike_session_multiple_sa_proposals_bool";
        
        Iwlan() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface CarrierConfigChangeListener
    {
        void onCarrierConfigChanged(final int p0, final int p1, final int p2, final int p3);
    }
}
