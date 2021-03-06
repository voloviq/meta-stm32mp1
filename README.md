OpenEmbedded BSP layer for stm32mp1 boards
==========================================

gunzip -c <IMAGE>.wic.gz | sudo dd of=/dev/sdX bs=1M iflag=fullblock oflag=direct conv=fsync

About:
-----
The purpose of this layer is to provide OpenEmbedded BSP support for
stm32mp1-based devices using upstream sources as much as possible.

Dependencies:
------------
    URI: git://git.openembedded.org/openembedded-core
    layers: meta
    branch: matched branches (e.g. master, warrior, dunfell, ...)

Status of supported boards:
--------------------------
builds and boots gpt image:

    stm32mp157a-dk1
    stm32mp157c-dk2
    VisionSOM-STM32MP1

Maintenance:
-----------

Please submit any patches against the `meta-stm32mp1` layer by using the
GitHub pull-request feature. Fork the repo, make a branch, do the
work, rebase from upstream, create the pull request.

For some useful guidelines to be followed when submitting patches,
please refer to [OpenEmbedded Guidelines](http://openembedded.org/wiki/Commit_Patch_Message_Guidelines)

Pull requests will be discussed within the GitHub pull-request
infrastructure. If you want to get informed on new PRs and the
follow-up discussions please use the GitHub's notification system.


Maintainer:
-----------
    Michal Wolowik <m.wolowik@emsyslabs.com>
    
Based on meta layer:
-----------
    Pierre-Jean Texier <pjtexier@koncepto.io>
    Joris Offouga <offougajoris@gmail.com>
