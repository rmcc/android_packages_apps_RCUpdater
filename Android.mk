LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE_TAGS := optional

LOCAL_SRC_FILES := $(call all-java-files-under, src)
LOCAL_SRC_FILES += src/rcupdaterapp/interfaces/IDownloadServiceCallback.aidl \
					src/rcupdaterapp/interfaces/IUpdateCheckServiceCallback.aidl \
					src/rcupdaterapp/interfaces/IUpdateCheckService.aidl \
					src/rcupdaterapp/interfaces/IDownloadService.aidl

LOCAL_PACKAGE_NAME := RCUpdater

LOCAL_PROGUARD_FLAGS := -include $(LOCAL_PATH)/proguard.flags

include $(BUILD_PACKAGE)
