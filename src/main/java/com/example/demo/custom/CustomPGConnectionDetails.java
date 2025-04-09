package com.example.demo.custom;

import org.springframework.boot.autoconfigure.service.connection.ConnectionDetails;

public interface CustomPGConnectionDetails extends ConnectionDetails {
  String getHost();
}
