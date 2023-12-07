/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings

// If you ever need to force a toolchain rebuild (taskcluster) then edit the following comment.
// FORCE REBUILD 2023-05-24

class DependenciesPlugin : Plugin<Settings> {
    override fun apply(settings: Settings) = Unit
}

// Synchronized version numbers for dependencies used by (some) modules
object Versions {
    // DO NOT MODIFY MANUALLY. This is auto-updated along with GeckoView.
    const val mozilla_glean = "56.0.0"

}

// Synchronized dependencies used by (some) modules
@Suppress("Unused", "MaxLineLength")
object ComponentsDependencies {


    val mozilla_geckoview = "org.mozilla.geckoview:${Gecko.channel.artifactName}:${Gecko.version}"
    val mozilla_appservices_fxaclient = "${ApplicationServicesConfig.groupId}:fxaclient:${ApplicationServicesConfig.version}"
    val mozilla_appservices_nimbus = "${ApplicationServicesConfig.groupId}:nimbus:${ApplicationServicesConfig.version}"
    const val mozilla_glean_forUnitTests = "org.mozilla.telemetry:glean-native-forUnitTests:${Versions.mozilla_glean}"
    val mozilla_appservices_autofill = "${ApplicationServicesConfig.groupId}:autofill:${ApplicationServicesConfig.version}"
    val mozilla_appservices_logins = "${ApplicationServicesConfig.groupId}:logins:${ApplicationServicesConfig.version}"
    val mozilla_appservices_places = "${ApplicationServicesConfig.groupId}:places:${ApplicationServicesConfig.version}"
    val mozilla_appservices_syncmanager = "${ApplicationServicesConfig.groupId}:syncmanager:${ApplicationServicesConfig.version}"
    val mozilla_remote_settings = "${ApplicationServicesConfig.groupId}:remotesettings:${ApplicationServicesConfig.version}"
    val mozilla_appservices_push = "${ApplicationServicesConfig.groupId}:push:${ApplicationServicesConfig.version}"
    val mozilla_appservices_tabs = "${ApplicationServicesConfig.groupId}:tabs:${ApplicationServicesConfig.version}"
    val mozilla_appservices_suggest = "${ApplicationServicesConfig.groupId}:suggest:${ApplicationServicesConfig.version}"
    val mozilla_appservices_httpconfig = "${ApplicationServicesConfig.groupId}:httpconfig:${ApplicationServicesConfig.version}"
    val mozilla_appservices_full_megazord = "${ApplicationServicesConfig.groupId}:full-megazord:${ApplicationServicesConfig.version}"
    val mozilla_appservices_full_megazord_forUnitTests = "${ApplicationServicesConfig.groupId}:full-megazord-forUnitTests:${ApplicationServicesConfig.version}"

    val mozilla_appservices_errorsupport = "${ApplicationServicesConfig.groupId}:errorsupport:${ApplicationServicesConfig.version}"
    val mozilla_appservices_rust_log_forwarder = "${ApplicationServicesConfig.groupId}:rust-log-forwarder:${ApplicationServicesConfig.version}"
    val mozilla_appservices_sync15 = "${ApplicationServicesConfig.groupId}:sync15:${ApplicationServicesConfig.version}"
}
