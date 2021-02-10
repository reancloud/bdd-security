package net.continuumsecurity.proxy;

public interface ContextModifier {
    void setIncludeInContext(String contextName, String regex);
    void setExcludeInContext(String contextName, String regex);

}
