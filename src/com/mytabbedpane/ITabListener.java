package com.mytabbedpane;

import java.util.EventListener;

public interface ITabListener extends EventListener {

  /**
   * Notified the listener that the containing tab is about to close. The
   * listener can veto the tab closing.
   *
   * @param event the notified event
   * @return whether the tab closing is to be done.
   */
  boolean tabWillClose(TabEvent event);

  void tabClosed();
}
