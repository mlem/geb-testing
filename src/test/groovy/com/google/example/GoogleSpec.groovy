package com.google.example

import at.willhaben.pages.WillhabenStartPage
import com.google.pages.GoogleHomePage
import com.google.pages.GoogleResultsPage
import geb.spock.GebReportingSpec
import org.wikipedia.pages.WikipediaPage

class GoogleSpec extends GebReportingSpec {

    def "the first link should be wikipedia"() {
        when:
        to GoogleHomePage

        and:
        q = "wikipedia"

        then:
        at GoogleResultsPage

        and:
        firstResultLink.text() == "Wikipedia"

        when:
        firstResultLink.click()

        then:
        waitFor { at WikipediaPage }
    }

    def "the first link should be willhaben"() {
        when:
        to GoogleHomePage

        and:
        q = "willhaben"

        then:
        at GoogleResultsPage

        and:
        firstResultLink.text() == "Willhaben"

        when:
        firstResultLink.click()

        then:
        at WillhabenStartPage
    }

}