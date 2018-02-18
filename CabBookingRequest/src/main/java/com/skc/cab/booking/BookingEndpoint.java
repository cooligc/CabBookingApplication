/**
 * 
 */
package com.skc.cab.booking;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author sitakant
 *
 */
@RepositoryRestResource(collectionResourceRel = "booking-request", path = "booking-request")
public interface BookingEndpoint extends PagingAndSortingRepository<BookingRequest, Long> {

}
