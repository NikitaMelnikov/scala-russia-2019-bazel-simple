#!/bin/bash

# https://blog.bazel.build/2015/06/17/visualize-your-build.html

bazel query 'deps(//:app_binary)' --output graph > graph.in
dot -Tpng < graph.in > graph.png

bazel query --noimplicit_deps 'deps(//:app_binary)' --output graph > simplified_graph.in
dot -Tpng < simplified_graph.in  > simplified_graph.png