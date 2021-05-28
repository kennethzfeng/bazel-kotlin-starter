load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# Kotlin
RULES_KOTLIN_VERSION = "legacy-1.3.0"
RULES_KOTLIN_SHA = "4fd769fb0db5d3c6240df8a9500515775101964eebdf85a3f9f0511130885fde"

http_archive(
    name = "io_bazel_rules_kotlin",
    sha256 = RULES_KOTLIN_SHA,
    strip_prefix = "rules_kotlin-%s" % RULES_KOTLIN_VERSION,
    type = "zip",
    urls = ["https://github.com/bazelbuild/rules_kotlin/archive/%s.zip" % RULES_KOTLIN_VERSION],
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kotlin_repositories", "kt_register_toolchains")
kotlin_repositories()  # if you want the default. Otherwise see custom kotlinc distribution below
kt_register_toolchains()  # to use the default toolchain, otherwise see toolchains below

# JVM External
RULES_JVM_EXTERNAL_TAG = "3.0"

RULES_JVM_EXTERNAL_SHA = "62133c125bf4109dfd9d2af64830208356ce4ef8b165a6ef15bbff7460b35c3a"

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)
load("@rules_jvm_external//:defs.bzl", "maven_install")
maven_install(
    name = "maven",
    artifacts = [
        # Undertow
        "io.undertow:undertow-core:2.2.7.Final",
        "io.undertow:undertow-servlet:2.2.7.Final",
        "io.undertow:undertow-websockets-jsr:2.2.7.Final",

        # Undertow Runtime Deps
        "org.jboss.xnio:xnio-api:3.3.8.Final",
        "org.jboss.xnio:xnio-nio:3.3.8.Final",
        "org.jboss.logging:jboss-logging:3.3.1.Final",
    ],
    repositories = [
        "https://repo1.maven.org/maven2",
    ],
)
