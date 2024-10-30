# Change Log
All notable changes to the debug adapter will be documented in this file.

## [0.4.5]
873ebb4 use runtimeClasspath during classpath resolution
7f05669 Use Kotlin DSL for gradle scripts (#81)
3b09a57 Style another note box

## [0.4.4]
- Kotlin 1.9.10
- Fix class path resolution by depending on the language server's shared module via a source dependency (see #78)

## [0.4.3]
- Kotlin 1.5.20
- Small fixes

## [0.4.2]
- Improve handling of cyclic references
- Ignore breakpoints from other languages
- Fix suspension policy on user breakpoints

## [0.4.1]
- Emit threads in attached VM correctly
- Fix breakpoint placements in local classes

## [0.4.0]
- Emit thread start/exit events
- Support vm arguments

## [0.3.1]
- Fix `attach`

## [0.3.0]
- Support evaluation of expressions
- Provide completions
- Display exception information

## [0.2.7]
- Add JDK 11+ support

## [0.2.6]
- Support for stepping into Java classes
- Automatic termination of the debugger once the VM exits

## [0.2.2]
- Move VSCode extension into external repository

## [0.2.1]
- Bugfixes to the variable list

## [0.2.0]
- `this` is now part of the local scope
- Inspection of variable fields and array elements

## [0.1.2]
- Local variable inspection
- Travis CI
- Bugfixes (executing on linux)

## [0.1.1]
- Badges

## [0.1.0]
- Initial release
- Breakpoints
- Threads
- Call stacks
- Debuggee Output in the Debug Console

## [0.0.1]
- Initial version
