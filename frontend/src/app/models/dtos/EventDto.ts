import { Track } from '../enums/Track';
import { EventType } from '../enums/EventType';
import { SessionDto } from './SessionDto';

export class EventDto {
  readonly configVersion = 1;
  readonly id: string;
  name: string;
  track: Track;
  eventType: EventType;
  preRaceWaitingTimeSeconds: number;
  sessionOverTimeSeconds: number;
  postQualySeconds: number;
  postRaceSeconds: number;
  ambientTemp: number;
  trackTemp: number;
  cloudLevel: number;
  rain: number;
  weatherRandomness: number;
  simracerWeatherConditions: number;
  isFixedConditionQualification: number;
  sessions: SessionDto[];
}
