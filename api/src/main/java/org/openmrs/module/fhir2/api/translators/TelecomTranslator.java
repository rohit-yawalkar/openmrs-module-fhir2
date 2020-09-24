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

import org.hl7.fhir.r4.model.ContactPoint;

public interface TelecomTranslator<T> extends ToFhirTranslator<T, ContactPoint>, UpdatableOpenmrsTranslator<T, ContactPoint> {
	
	/**
	 * Maps an Openmrs Attribute representing a contact point to a FHIR {@link ContactPoint}
	 * 
	 * @param attribute the OpenMRS attribute element to translate
	 * @return the corresponding FHIR ContactPoint resource
	 */
	@Override
	ContactPoint toFhirResource(@Nonnull T attribute);
	
	/**
	 * Maps a FHIR {@link ContactPoint} to a corresponding Openmrs attribute
	 * 
	 * @param existingAttribute the attribute to update
	 * @param contactPoint the contactPoint to map
	 * @return an updated or mapped version of the openMrs attribute
	 */
	@Override
	T toOpenmrsType(@Nonnull T existingAttribute, @Nonnull ContactPoint contactPoint);
}
