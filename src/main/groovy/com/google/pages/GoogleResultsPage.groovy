package com.google.pages

import geb.Page

class GoogleResultsPage extends Page {

    static at = { waitFor { title.endsWith("Google") } }
    static content = {
        results(wait: true) { $("li.g") }
        result { index -> results[index] }
        resultLink { index -> result(index).find("h3.r a") }
        firstResultLink { resultLink(0) }
    }

}