FROM jenkins/jenkins:lts-jdk17

USER root

RUN curl -sS https://get.docker.com/ | sh

USER jenkins