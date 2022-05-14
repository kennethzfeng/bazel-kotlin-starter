load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# Kotlin
RULES_KOTLIN_VERSION = "v1.5.0"
RULES_KOTLIN_SHA256 = "12d22a3d9cbcf00f2e2d8f0683ba87d3823cb8c7f6837568dd7e48846e023307"
http_archive(
    name = "io_bazel_rules_kotlin",
    url = "https://github.com/bazelbuild/rules_kotlin/releases/download/%s/rules_kotlin_release.tgz" % RULES_KOTLIN_VERSION,
    sha256 = RULES_KOTLIN_SHA256,
)

load("@io_bazel_rules_kotlin//kotlin:repositories.bzl", "kotlin_repositories")
kotlin_repositories()

load("@io_bazel_rules_kotlin//kotlin:core.bzl", "kt_register_toolchains")
kt_register_toolchains()

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
