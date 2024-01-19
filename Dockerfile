FROM ubuntu:latest
LABEL authors="manoe"

ENTRYPOINT ["top", "-b"]