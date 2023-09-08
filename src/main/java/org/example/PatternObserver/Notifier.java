package org.example.PatternObserver;

interface Notifier{
    public void addObserver(Observer obs);
    public void removeObserver(Observer obs);
    public void notifyObserver();
}
