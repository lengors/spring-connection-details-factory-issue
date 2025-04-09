package com.example.demo.custom;

import org.springframework.boot.docker.compose.core.RunningService;
import org.springframework.boot.docker.compose.service.connection.DockerComposeConnectionDetailsFactory;
import org.springframework.boot.docker.compose.service.connection.DockerComposeConnectionSource;

class CustomPGConnectionDetailsFactory extends DockerComposeConnectionDetailsFactory<CustomPGConnectionDetails> {
  private static final String[] CONTAINER_NAMES = { "postgres" };

  CustomPGConnectionDetailsFactory() {
    super(CONTAINER_NAMES);
  }

  @Override
  protected CustomPGConnectionDetails getDockerComposeConnectionDetails(final DockerComposeConnectionSource source) {
    return new CustomPGDockerComposeConnectionDetails(source.getRunningService());
  }

  static class CustomPGDockerComposeConnectionDetails extends DockerComposeConnectionDetails
      implements CustomPGConnectionDetails {
    private final String host;

    CustomPGDockerComposeConnectionDetails(final RunningService runningService) {
      super(runningService);
      this.host = runningService.host();
    }

    @Override
    public String getHost() {
      return this.host;
    }
  }
}
