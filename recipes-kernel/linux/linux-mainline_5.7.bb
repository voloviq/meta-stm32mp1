require linux-mainline-common.inc

LINUX_VERSION ?= "5.7.x"
KERNEL_VERSION_SANITY_SKIP="1"

BRANCH = "linux-5.7.y"

SRCREV = "${AUTOREV}"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;branch=${BRANCH} \
    file://0001-ARM-stm32mp1-r1-MACHINE.patch \
    file://0002-ARM-stm32mp1-r1-CPUFREQ.patch \
    file://0001-visionsom-add-display-powertip-ph800480t013-ibc17.patch \
    file://0001-visionsom-defconfig-dtsi-rgb.patch \
    file://overlay.cfg \
    file://defconfig \
"