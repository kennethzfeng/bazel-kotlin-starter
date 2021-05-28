# Bazel Kotlin Starter
This is a repository template for building a Kotlin project with Bazel.

## Build with Bazel
1. Download [`bazelisk`](https://github.com/bazelbuild/bazelisk/releases), a user-friendly bazel launcher for Bazel
2. Put the `bazelisk` binary in your `PATH`
3. Run `bazel build //src/me/kfeng/http/...`

## Run (Local Development)
```shell
bazel run src/me/kfeng/http:HttpServer
```
## Deploy
- Run `bazel build src/me/kfeng/http:HttpServer_deploy.jar`,
which should generate a deploy jar, containing all of
JVM depdencies.
- Drop the deploy jar onto a machine
- Run `java -jar /path/to/deploy.jar`
