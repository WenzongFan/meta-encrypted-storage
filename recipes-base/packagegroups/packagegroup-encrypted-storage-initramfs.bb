#
# Copyright (C) 2016-2017 Wind River Systems Inc.
#

include packagegroup-encrypted-storage.inc

DESCRIPTION = "The packages used for encrypted storage in initramfs."

RDEPENDS_${PN} += " \
    cryptfs-tpm2-initramfs \
    packagegroup-tpm2-initramfs \
"
