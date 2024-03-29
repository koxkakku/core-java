package com.sharad.learn.corejava.basic;

import java.util.*;

/**
 * @author koxkakku
 */

// This is the observer
class Observer1 implements Observer {
	public void update(Observable obj, Object arg) {
		System.out.println("Observer1 is added");
	}
}

// This is class being observed
class BeingObserved extends Observable {
	void incre() {
		setChanged();
		notifyObservers();
	}
}

public class ObsevableDemo {
	public static void main(String args[]) {
		BeingObserved beingObserved = new BeingObserved();
		Observer1 observer1 = new Observer1();
		beingObserved.addObserver(observer1);
		beingObserved.incre();

	}
}
