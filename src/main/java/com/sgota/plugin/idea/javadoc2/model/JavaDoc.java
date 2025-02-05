package com.sgota.plugin.idea.javadoc2.model;

import java.util.List;
import java.util.Map;

/**
 * The type Java doc.
 *
 * @author Sergey Timofiychuk,tiankuo
 */
public class JavaDoc {

    private final List<String> descriptions;
    private final Map<String, List<JavaDocTag>> tags;

    /**
     * Instantiates a new Java doc.
     *
     * @param descriptions the Description
     * @param tags         the Tags
     */
    public JavaDoc(List<String> descriptions, Map<String, List<JavaDocTag>> tags) {
        this.descriptions = descriptions;
        this.tags = tags;
    }

    /**
     * Gets the description.
     *
     * @return the Description
     */
    public List<String> getDescriptions() {
        return descriptions;
    }

    /**
     * Gets the tags.
     *
     * @return the Tags
     */
    public Map<String, List<JavaDocTag>> getTags() {
        return tags;
    }
}
