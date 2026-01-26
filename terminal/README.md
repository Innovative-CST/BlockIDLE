## Embedded Termux Environment

This project integrates the full Termux Android application into a custom Android app, with additional modifications and extensions to fit the needs of this project.

The core functionality, architecture, and native components are derived from the official Termux project, while UI, behavior, and integrations have been customized.


---

## Features

- Full Linux environment powered by Termux
- Terminal session support inside the app
- Package management using apt
- Native binaries prebuilt and bundled
- Custom UI and application-level integrations
- Additional logic layered on top of the original Termux codebase

---

## Implementation Details

- The original Termux app source code has been copied into this project
- Select components were modified, removed, or extended
- Native binaries are precompiled externally and bundled (no runtime NDK build required)
- App-specific logic is implemented on top of Termux core modules


> **⚠️ This is not an official Termux build and is not supported by the Termux team.**

---

## Source of Original Code

This project module is based on the official Termux repositories:

- [Termux App](https://github.com/termux/termux-app)
- [Termux Packages](https://github.com/termux/termux-packages)

All original copyrights belong to their respective authors.

---

## License & Attribution

Termux is licensed under the GPLv3 license.

This project:

- Retains the original license
- Complies with GPLv3 license requirements
- Includes this attribution as required by the license

If you redistribute this app or its source, you must also comply with GPLv3.

The `termux/termux-app` repository is released under [GPLv3 only](https://www.gnu.org/licenses/gpl-3.0.html) license.

### Exceptions

- [Terminal Emulator for Android](https://github.com/jackpal/Android-Terminal-Emulator) code is used which is released under [Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0) license. Check [`terminal-view`](terminal-view) and [`terminal-emulator`](terminal-emulator) libraries.
- Check [`termux-shared/LICENSE.md`](termux-shared/LICENSE.md) for `termux-shared` library related exceptions.

---

## Disclaimer

This project is independent and unofficial
It is not affiliated with or endorsed by the Termux developers
Bugs introduced by modifications are the responsibility of this project

---

## Author & Modifications

- **Modified and integrated by**: *Dev Kumar*
- **Purpose** : Embedding a full Linux terminal environment into a custom Android application to provide command line interface in BlockIDLE

---

## Notes

- Some Termux features may behave differently due to sandboxing or app-specific restrictions
- Updates from upstream Termux may require manual merging
