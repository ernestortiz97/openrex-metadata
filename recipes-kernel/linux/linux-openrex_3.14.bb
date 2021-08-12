# Copyright (C) 2012-2015 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel for OpenRex board"
DESCRIPTION = "Linux Kernel for OpenRex board. More info \
at http://www.imx6rex.com/open-rex"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "jethro"
LOCALVERSION = "-fslc"

SRCREV = "bfbdad4309a7a125788f2603302df369c2e4dd9c"

SRC_URI = "git://github.com/ernestortiz97/openrex-linux.git;branch=${SRCBRANCH} \
           file://defconfig"


#PV .= "+git${SRCPV}"
PV .= ""


COMPATIBLE_MACHINE = "(mx6|mx7)"
