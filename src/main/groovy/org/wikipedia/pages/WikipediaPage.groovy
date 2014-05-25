package org.wikipedia.pages

import geb.Page

class WikipediaPage extends Page {
    static at = { title == "Wikipedia" }
}