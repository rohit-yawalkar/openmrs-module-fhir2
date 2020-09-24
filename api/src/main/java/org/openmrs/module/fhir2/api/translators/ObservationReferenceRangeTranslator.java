/*
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.fhir2.api.translators;

import javax.annotation.Nonnull;

import java.util.List;

import org.hl7.fhir.r4.model.Observation;
import org.openmrs.ConceptNumeric;

public interface ObservationReferenceRangeTranslator extends ToFhirTranslator<ConceptNumeric, List<Observation.ObservationReferenceRangeComponent>> {
	
	@Override
	List<Observation.ObservationReferenceRangeComponent> toFhirResource(@Nonnull ConceptNumeric concept);
}
