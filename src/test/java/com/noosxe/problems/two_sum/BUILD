java_library(
    name = "two_sum",
    srcs = glob(["*.java"]),
    deps = [
        "//src/main/java/com/noosxe/problems/two_sum",
        "//third_party:junit4",
    ],
)

java_test(
    name = "AllTests",
    size = "small",
    test_class = "com.noosxe.problems.two_sum.TwoSumTest",
    runtime_deps = [
        ":two_sum",
    ],
)
