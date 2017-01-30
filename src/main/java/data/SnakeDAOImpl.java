package data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SnakeDAOImpl implements SnakeDAO {
	List<Snake> allSnakes;

	@Override
	public Snake addSnake(Snake snake) {
		if (snake != null) {
			allSnakes.add(snake);
			return snake;
		}
		return null;
	}

	@Override
	public Snake removeSnake(String name) {
		Snake snake2 = null;
		if (name != null) {
			snake2 = getSnake(name);
		}
		allSnakes.remove(snake2);
		return snake2;
	}

	@Override
	public Snake updateSnake(String name, Snake snake) {
		int i = -1;
		Snake snake2 = getSnake(name);
		if (snake2 != null && snake != null) {
			i = allSnakes.indexOf(snake2);
		}
		if (i > -1) {
			allSnakes.remove(i);
			allSnakes.add(i, snake);
			return snake;
		}
		return null;

	}

	@Override
	public Snake getSnake(String name) {
		Snake snake = null;
		if (name != null) {
			for (Snake s : allSnakes) {
				if (s.getName().equals(name)) {
					snake = s;
				}
			}
		}
		return snake;
	}

	@Override
	public List<Snake> getSnakesInLocation(String rack, String bin) {
		List<Snake> snakes = new ArrayList<>();
		if (rack != null && bin != null) {
			String loc = rack + ":" + bin;
			snakes = getSnakesInLocation(loc);
		}
		return snakes;
	}

	@Override
	public List<Snake> getSnakesInLocation(String location) {
		List<Snake> snakes = new ArrayList<>();
		if (location != null) {
			for (Snake s : allSnakes) {
				if (s.getLocation() != null && s.getLocation().equals(location)) {
					snakes.add(s);
				}
			}
		}
		return snakes;
	}

	@Override
	public List<Snake> getSnakesInRack(String rack) {
		List<Snake> snakes = new ArrayList<>();
		if (rack != null) {
			for (Snake s : allSnakes) {
				if (s.getTempRack() != null && s.getTempRack().equals(rack)) {
					snakes.add(s);
				} else if (s.getHomeRack() != null && s.getHomeRack().equals(rack)) {
					snakes.add(s);
				}
			}
		}

		return snakes;
	}

	@Override
	public List<Snake> getSnakesByBreederActionDate(LocalDate date) {
		List<Snake> snakes = new ArrayList<>();
		if (date != null) {
			for (Snake s : allSnakes) {
				List<BreederAction> actions = s.getActions();
				if (actions != null && actions.size() > 0) {
					for (BreederAction ba : actions) {
						if (ba.getDate().equals(date))
							snakes.add(s);
					}
				}
			}
		}

		return snakes;
	}

	@Override
	public Snake addBreederAction(Snake snake, BreederAction action) {
		Snake s = null;
		if (snake != null && action != null) {
			int i = allSnakes.indexOf(snake);
			if (i > -1) {
				s = allSnakes.get(i);
				s.getActions().add(action);
			}
		}
		return s;
	}

	@Override
	public Snake addBreederAction(String name, BreederAction action) {
		Snake s = getSnake(name);
		if (s != null && action != null) {
			s.getActions().add(action);
			return s;
		}
		return null;
	}

	@Override
	public Snake updateBreederAction(String name, BreederAction action) {
		Snake s = getSnake(name);
		if (s != null && action != null) {
			for (BreederAction ba : s.getActions()) {
				if (ba.getDate().equals(action.getDate())) {
					ba = action;
					return s;
				}
			}
		}
		return null;
	}

	@Override
	public Snake updateBreederAction(Snake snake, BreederAction action) {
		Snake s = snake;
		if (s != null && action != null) {
			for (BreederAction ba : s.getActions()) {
				if (ba.getDate().equals(action.getDate())) {
					ba = action;
					return s;
				}
			}
		}
		return null;
	}

	@Override
	public Snake pairSnake(Snake snakeMoving, Snake snakeTarget) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Snake pairSnake(String snakeNameMoving, String snakeNameTarget) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Snake moveSnake(Snake snakeMoving, String rack, String bin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BreederAction getLastActionWith(String param, Snake snake) {
		List<BreederAction> subactions = getAllActionsWith(param, snake);
		if (!subactions.isEmpty()) {
			return subactions.get(subactions.size() - 1);
		}

		return null;
	}

	@Override
	public BreederAction getFirstActionWith(String param, Snake snake) {
		List<BreederAction> subactions = getAllActionsWith(param, snake);
		if (!subactions.isEmpty()) {
			return subactions.get(0);
		}

		return null;
	}

	@Override
	public List<BreederAction> getAllActionsWith(String param, Snake snake) {
		List<BreederAction> subactions = new ArrayList<>();
		if (snake != null && param != null) {
			List<BreederAction> actions = snake.getActions();
			for (BreederAction ba : actions) {
				switch (param) {
				case "shed":
					if (!ba.getShed().equals("")) {
						subactions.add(ba);
					}
					break;
				case "feed":
					if (!ba.getFeed().equals("")) {
						subactions.add(ba);
					}
					break;
				case "weight":
					if (!ba.getWeight().equals("")) {
						subactions.add(ba);
					}
					break;
				case "symptoms":
					if (!ba.getSymptoms().equals("")) {
						subactions.add(ba);
					}
					break;
				case "paired":
					if (!ba.getPaired().equals("")) {
						subactions.add(ba);
					}
					break;
				case "locked":
					if (!ba.getLocked().equals("")) {
						subactions.add(ba);
					}
					break;
				case "notes":
					if (!ba.getNotes().equals("")) {
						subactions.add(ba);
					}
					break;
				case "ovulating":
					if (!ba.getOvulating().equals("")) {
						subactions.add(ba);
					}
					break;
				case "laidEggs":
					if (!ba.getLaidEggs().equals("")) {
						subactions.add(ba);
					}
					break;
				}
			}
		}

		return subactions;
	}

	@Override
	public List<BreederAction> getAllActions(Snake snake) {
		if (snake != null) {
			return snake.getActions();
		}
		return null;
	}

	@Override
	public List<Snake> getAllSnakes() {
		return allSnakes;
	}
}
