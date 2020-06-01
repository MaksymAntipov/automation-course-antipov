package infrastructure.utils;

public class TestUrl {

    private String protocol;
    private String domain;
    private String port;
    private String path;
    private String params;

    private TestUrl() {
    }

    public TestUrl(String protocol, String domain, String port, String path, String params) {
        this.protocol = protocol;
        this.domain = domain;
        this.port = port;
        this.path = path;
        this.params = params;
    }

    public String getProtocol() {return protocol;}

    public String getDomain() {return domain;}

    public int getPort() {return port;}

    public String getPath() {return path;}

    public String getParams() {return params;}

    public static class Builder {
        private TestUrl url;

        public Builder() {
            url = new TestUrl();
        }

        public Builder withProtocol(String protocol) {
            url.protocol = protocol;
            return this;
        }

        public Builder withDomain(String domain) {

            url.domain = domain;
            return this;
        }

        public Builder withPort(int port) {
            if (port < 0 && port > 65535)
                url.port = "";

            url.port = "" + port;
            return this;
        }

        public Builder withPath(String path) {

            url.path = path;
            return this;
        }

        public Builder withParam(String param) {
            url.params +=param + "&";
            return this;
        }

        public Builder withParam(String key, String value) {
            url.params += key + "=" + value + "&";
            return this;
        }
    }
        public String build (){

        String result = "";
        if (url.protocol +=)
        return "";
}


    @Override
    public String toString() {
        return "TestUrl{" +
                "protocol='" + protocol + '\'' +
                ", domain='" + domain + '\'' +
                ", port='" + port + '\'' +
                ", path='" + path + '\'' +
                ", params='" + params + '\'' +
                '}';
    }
}
