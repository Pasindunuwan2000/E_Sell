// src/pages/NotFound.tsx
import React from "react";
import { Button } from "@/components/ui/button";
import { useNavigate } from "react-router-dom";

const NotFound = () => {
  const navigate = useNavigate();

  return (
    <div className="flex flex-col items-center justify-center h-screen text-center p-4">
      <h1 className="text-5xl font-bold text-red-600 mb-4">404</h1>
      <p className="text-xl mb-6">Page Not Found</p>
      <Button onClick={() => navigate("/")} variant="default">
        Go to Homepage
      </Button>
    </div>
  );
};

export default NotFound;
