package org.luksza.gerrit;

import java.util.Arrays;
import java.util.List;

import com.google.gerrit.extensions.annotations.Listen;
import com.google.gerrit.extensions.webui.TopMenuExtension;

@Listen
public class MyTopMenuExtension implements TopMenuExtension {

  @Override
  public List<MenuEntry> getEntrys() {
    return Arrays.<MenuEntry> asList(new MenuEntry("Entry from plugin", Arrays.asList(
        new MenuItem("luksza.org", "http://luksza.org/"),
        new MenuItem("CollabNet", "http://collab.net/"))));
  }
}
