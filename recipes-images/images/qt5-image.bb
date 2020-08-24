DESCRIPTION = "A QT5 image with wifi support application for SoMLabs Board"
LICENSE = "MIT"

NETWORK_APP = " \
    openssh openssh-keygen openssh-sftp-server \
"

IMAGE_LINGUAS = "pl-pl"

inherit core-image

IMAGE_FEATURES += " \
    splash \
"

SYSTEM_TOOLS_INSTALL = " \
    i2c-tools \
    memtester \
    sysbench \
    tzdata \
    devmem2 \
    minicom \
    linux-firmware-bluetooth-bcm4343 \
    linux-firmware \
"

QT_TOOLS = " \
    qtbase \
    qtbase-plugins \
    qtserialport \
    qt5-env \
"

FONTS = " \
    fontconfig \
    fontconfig-utils \
    liberation-fonts \
"

QT_DEV_TOOLS = " \
    qtbase-dev \
    qtbase-mkspecs \
    qtbase-tools \
    qtserialport-dev \
    qtserialport-mkspecs \
"

KERNEL_EXTRA_INSTALL = " \
    kernel-devicetree \
    kernel-modules \
 "

DEV_TOOLS_INSTALL = " \
    mtd-utils \
"

NETWORK_TOOLS_INSTALL = " \
"


UTILITIES_INSTALL = " \
    coreutils \
    gdbserver \
    mtd-utils \
    ldd \
    libstdc++ \
    libstdc++-dev \
    openssh-sftp \
    ppp \
"

TSLIB = " \
    tslib \
    tslib-calibrate \
    tslib-conf \
    tslib-dev \
    tslib-tests \
"

WIFI_SUPPORT = " \
    iw \
    wpa-supplicant \
    bluez5 \
    wpa-supplicant-passphrase \
    wpa-supplicant-cli \
    iproute2 \
    iproute2-tc \
"

IMAGE_INSTALL += " \
  ${DEV_TOOLS_INSTALL} \
  ${SYSTEM_TOOLS_INSTALL} \
  ${UTILITIES_INSTALL} \
  ${NETWORK_APP} \
  ${FONTS} \
  ${WIFI_SUPPORT} \
  ${QT_TOOLS} \
  ${KERNEL_EXTRA_INSTALL} \
  ${TSLIB} \
"

#Always add cmake to sdk
TOOLCHAIN_HOST_TASK_append = " nativesdk-cmake"

#Always add cmake to sdk
TOOLCHAIN_HOST_TASK_append = " nativesdk-cmake"

DISTRO_FEATURES_remove = " x11 wayland opengl pulseaudio opengles egl xcb "
PACKAGECONFIG_DISTRO_append_pn_qtbase = " linuxfb tslib "
IMAGE_INSTALL_append = " qtbase qtbase-plugins "

DISTRO_FEATURES_remove = " x11 wayland opengl pulseaudio opengles egl xcb "
# PACKAGECONFIG_DISTRO_append_pn_qtbase = " linuxfb tslib "
# IMAGE_INSTALL_append = " qtbase qtbase-plugins "
# CORE_IMAGE_EXTRA_INSTALL = "python-core python-pip"
