package svarog.enrichment

import svarog.data.YesMaybeNo
import svarog.data.YesMaybeNo.NMY
import svarog.order_theory.SymmetricMonoidalPreorder

// Half open circuit? Circuit breaker?
trait YMNCategory[X] extends EnrichedCategory[NMY,X] {
  def base: SymmetricMonoidalPreorder[NMY] = YesMaybeNo.`(NMY, ≤, yes, min)`
}
