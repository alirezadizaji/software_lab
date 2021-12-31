package com.unittest.codecoverage.services.impl;

import com.unittest.codecoverage.exceptions.BehaviorException;
import com.unittest.codecoverage.models.Footpassenger;
import com.unittest.codecoverage.models.StreetDirectionFlow;
import com.unittest.codecoverage.models.Traffic;
import com.unittest.codecoverage.models.TrafficLigth;
import com.unittest.codecoverage.services.TrafficBehaviorService;

public class TrafficBehaviorServiceImpl implements TrafficBehaviorService {

	@Override
	public void footpassengerCrossTheStreet(Traffic currentTrafic, Footpassenger currentFootpassengerBehavior) {
		
		if(TrafficLigth.RED.equals(currentFootpassengerBehavior.getCrossedTrafficLigth()) && 
				currentFootpassengerBehavior.crossedTheRoad() &&
				currentTrafic.intenseCarTraffic()) {
			throw new BehaviorException("You should'nt do that, reckless person");
		}
		
		if(TrafficLigth.GREEN.equals(currentFootpassengerBehavior.getCrossedTrafficLigth()) &&
				currentTrafic.intenseCarTraffic() && 
				!currentFootpassengerBehavior.lookedToTheLeft() && 
				!currentFootpassengerBehavior.lookedToTheRight()) {
			throw new BehaviorException("You should be more careful");
		}

		if(TrafficLigth.YELLOW.equals(currentFootpassengerBehavior.getCrossedTrafficLigth()) &&
				TrafficLigth.YELLOW.equals(currentTrafic.getCurrentTrafficLight()) &&
				currentTrafic.getMaxSpeedAllowed() > 100 &&
				currentTrafic.getMinSpeedAllowed() > 60 &&
				currentTrafic.getStreetDirectionFlow() == StreetDirectionFlow.TWO_WAY &&
				currentTrafic.intenseCarTraffic() &&
				currentFootpassengerBehavior.crossedTheCrosswalk()) {
			throw new BehaviorException("Hey! that's like committing suicide");
		}

	}

}
