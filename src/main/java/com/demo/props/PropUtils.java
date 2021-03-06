package com.demo.props;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

import com.demo.LogManager.LogUtils;

public class PropUtils {
  static public Optional<String> getProperty(String property) throws Exception {
    Properties propGet = new Properties();

    InputStream inputStream = PropUtils.class.getResourceAsStream("project.properties");

    propGet.load(inputStream);

    if (propGet.containsKey(property)) {
      return Optional.of(propGet.getProperty(property));
    }
    return Optional.empty();
  }
}
