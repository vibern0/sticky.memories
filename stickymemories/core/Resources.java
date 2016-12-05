package stickymemories.core;

import java.net.URL;
import stickymemories.StickyMemories;
/**
 *
 * @author andre
 */
public class Resources {
    public static URL getResourceFile(String path){
        return StickyMemories.class.getResource(path);
    }
}
