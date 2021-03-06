package net.mamoe.mirai.api.http

import com.vdurmont.semver4j.Semver
import net.mamoe.mirai.console.plugin.description.PluginDependency
import net.mamoe.mirai.console.plugin.description.PluginKind
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription

object HttpApiPluginDescription : JvmPluginDescription {
    override val author: String = "ryoii"
    override val dependencies: List<PluginDependency> = emptyList()
    override val info: String = "Mirai HTTP API Server Plugin"
    override val kind: PluginKind = PluginKind.NORMAL
    override val name: String = "MiraiAPIHTTP"
    override val version: Semver = Semver("1.8.0")
}