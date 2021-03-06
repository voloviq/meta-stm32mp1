require u-boot-stm32mp-common_${PV}.inc
require u-boot-stm32mp.inc

SUMMARY = "Universal Boot Loader for embedded devices for stm32mp"
LICENSE = "GPLv2+"

PROVIDES += "u-boot"
RPROVIDES_${PN} += "u-boot"

# ---------------------------------
# Configure archiver use
# ---------------------------------
include ${@oe.utils.ifelse(d.getVar('ST_ARCHIVER_ENABLE') == '1', 'u-boot-stm32mp-archiver.inc','')}

SRC_URI += "file://0001-Boot-from-mmc0-only.patch \
            file://0001-visionsom-add-defconfig-rgb-display.patch "