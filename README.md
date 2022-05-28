> docker run --rm -v $PWD:/app -w /app eclipse-temurin:17_35-jdk-focal java Main

```
null
content/unknown
```

> docker run --rm -v $PWD:/app -w /app eclipse-temurin:17.0.3_7-jdk java Main

```
text/javascript
text/javascript
```

Changed with https://github.com/adoptium/jdk17u/commit/ab3dd202d7a51f113ec57e98ed32d27f565a9c69. Seems to be causing an issue in Rhino: https://github.com/mozilla/rhino/blob/master/src/org/mozilla/javascript/commonjs/module/provider/UrlModuleSourceProvider.java#L171
