load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test", "scala_test_suite")

scala_binary(
    name = 'app_binary',
    main_class = 'demo.Main',
    deps = [
        ':app'
    ]
)

scala_library(
    name = 'app',
    srcs = glob([
        'src/main/scala/demo/Main.scala'
    ]),
    deps = [
        ':conference'
    ]
)

scala_library(
    name = 'id_generator',
    srcs = glob([
        'src/main/scala/demo/IdGenerator.scala'
    ])
)

scala_library(
    name = 'visitor',
    srcs = glob([
        'src/main/scala/demo/Visitor.scala'
    ])
)

scala_library(
    name = 'conference',
    srcs = glob([
        'src/main/scala/demo/Conference.scala'
    ]),
    deps = [
        ':id_generator',
        ':visitor'
    ],
    exports = [
        ':id_generator',
        ':visitor'
    ]
)