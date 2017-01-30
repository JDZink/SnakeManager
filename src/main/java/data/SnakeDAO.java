package data;

import java.time.LocalDate;
import java.util.List;

public interface SnakeDAO {
		public Snake addSnake(Snake snake);
		public Snake removeSnake(String name);
		public Snake getSnake(String name);
		public List<Snake> getSnakesInLocation(String rack, String bin);
		public List<Snake> getSnakesInLocation(String location);
		public List<Snake> getSnakesInRack(String rack);
		public List<Snake> getSnakesByBreederActionDate(LocalDate date);
		public Snake addBreederAction(Snake snake, BreederAction action);
		public Snake addBreederAction(String name, BreederAction action);
		public Snake updateBreederAction(String name, BreederAction action);
		public Snake updateBreederAction(Snake snake, BreederAction action);
		public Snake pairSnake(Snake snakeMoving, Snake snakeTarget);
		public Snake pairSnake(String snakeNameMoving, String snakeNameTarget);
		public Snake moveSnake(Snake snakeMoving, String rack, String bin);
		public BreederAction getLastActionWith(String param, Snake snake);
		public BreederAction getFirstActionWith(String param, Snake snake);
		public List<BreederAction> getAllActionsWith(String paramm, Snake snake);
		public List<BreederAction> getAllActions(Snake snake);
		public Snake updateSnake(String name, Snake snake);
		public List<Snake> getAllSnakes();

}
