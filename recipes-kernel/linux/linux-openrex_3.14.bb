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

SRCREV = "5afeeb2764a1327a1f65603e594985f0bbc9e32d"

SRC_URI = "git://github.com/ernestortiz97/openrex-linux.git;branch=${SRCBRANCH} \
           file://defconfig"


#PV .= "+git${SRCPV}"
PV .= ""


COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-openrex|imx6s-openrex)"
