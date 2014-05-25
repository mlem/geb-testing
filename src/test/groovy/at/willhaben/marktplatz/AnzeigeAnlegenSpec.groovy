package at.willhaben.marktplatz

import at.willhaben.pages.WillhabenStartPage
import at.willhaben.pages.marktplatz.WillhabenMarktplatzPage
import geb.spock.GebReportingSpec

class AnzeigeAnlegenSpec extends GebReportingSpec {

    def "go to marktplatz"() {
        when:
        to WillhabenStartPage

        then:
        at WillhabenStartPage

        when:
        marktplatzLink.click()

        then:
        at WillhabenMarktplatzPage

    }

}