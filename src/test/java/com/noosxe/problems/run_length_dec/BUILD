java_library(
    name = "run_length_dec",
    srcs = glob(["*.java"]),
    deps = [
        "//src/main/java/com/noosxe/problems/run_length_dec",
        "//third_party:junit4",
    ],
)

java_test(
    name = "AllTests",
    size = "small",
    test_class = "com.noosxe.problems.run_length_dec.RunLengthDecTest",
    runtime_deps = [
        ":run_length_dec",
    ],
)
