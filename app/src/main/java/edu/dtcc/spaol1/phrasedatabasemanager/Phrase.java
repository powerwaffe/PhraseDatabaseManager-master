package edu.dtcc.spaol1.phrasedatabasemanager;

class Phrase
{
    // Variables
    private int _id;
    private String _phrase_title;
    private String _phrase;

    // Empty constructor
    Phrase() {}

    // Two parameter constructor
    Phrase(String _phrase_title, String _phrase)
    {
        this._phrase_title = _phrase_title;
        this._phrase = _phrase;
    }

    // Getters
    int get_id()
    {
        return _id;
    }

    String get_phrase()
    {
        return _phrase;
    }

    String get_phrase_title()
    {
        return _phrase_title;
    }

    // Setters
    void set_id(int _id)
    {
        this._id = _id;
    }

    void set_phrase_title(String _phrase_title)
    {
        this._phrase_title = _phrase_title;
    }

    void set_phrase(String _phrase)
    {
        this._phrase = _phrase;
    }
}