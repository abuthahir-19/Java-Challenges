, obj);
        }
        else {
            ArrayList <EdgeNode> obj = new ArrayList<>();
            obj.add(node);
            map.put(u, obj);
        }
    }

    private static void printPath () {
        for (Map.Entry <Integer, ArrayList<EdgeNode>> obj : map.entrySet()) {
            System.out.print (obj.getKey() + " ");
            ArrayList<EdgeNode> list = obj.getValue();
            for (EdgeNode value : list) {
                System.out.println (value.v + " " + value.time);
            }
        }
    }
}
